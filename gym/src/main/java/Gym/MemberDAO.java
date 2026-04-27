package Gym;

import java.sql.*;
import java.util.*;

public class MemberDAO {
    //신규 등록
    public void insertMember(int id, String name, String phone, int ptCount) {
        String sql = "INSERT INTO members (member_id , name, phone, start_date, pt_count) VALUES (?, ?, ?, CURDATE(), ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, phone);
            ps.setInt(4, ptCount);
            ps.executeUpdate();
            System.out.println("회원 등록이 완료되었습니다");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //전체 조회
    public List<MemberDTO> selectAll() {
        String sql = "SELECT member_id, name, phone, start_date, pt_count FROM members";
        List<MemberDTO> memberList = new ArrayList<>();

     try (Connection conn = DBUtil.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                MemberDTO member = new MemberDTO();
                member.setMemberId(rs.getInt("member_id"));
                member.setName(rs.getString("name"));
                member.setPhone(rs.getString("phone"));
                member.setStartDate(rs.getDate("start_date"));
                member.setPtCount(rs.getInt("pt_count"));
                memberList.add(member);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return memberList;
    }

    //pt 횟수 차감
    public void updatePT(int id) {
        String sql = "UPDATE members SET pt_count = pt_count - 1 WHERE member_id = ? AND pt_count > 0";
        try (Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int count = ps.executeUpdate();
            if (count > 0) {
                System.out.println("출석 완료 : PT가 1회 차감되었습니다.");
            }
            else {
                System.out.println("존재하지 않는 ID 이거나 남은 PT 횟수가 없습니다");
            }
        } catch (Exception e) { e.printStackTrace(); }
    }


    //회원정보 삭제
    public void deleteMember(int id) {
        String sql = "DELETE FROM members WHERE member_id = ?";
        try (Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("회원 정보가 삭제되었습니다");
        } catch (Exception e) { e.printStackTrace(); }
    }

}
