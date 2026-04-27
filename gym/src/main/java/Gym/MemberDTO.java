package Gym;
import java.sql.*;
public class MemberDTO {

    private int memberId;
    private String name;
    private String phone;
    private Date startDate;
    private int ptCount;

    public MemberDTO() {}

    //생성자
    public MemberDTO(int memberId, String name, String phone, Date startDate, int ptCount) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
        this.startDate = startDate;
        this.ptCount = ptCount;
    }

    //Getter 및 Setter
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getPtCount() {
        return ptCount;
    }

    public void setPtCount(int ptCount) {
        this.ptCount = ptCount;
    }
}
