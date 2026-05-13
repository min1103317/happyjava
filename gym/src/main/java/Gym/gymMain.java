package Gym;

import java.awt.*;
import java.util.*;
import java.util.List;


public class gymMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberDAO dao = new MemberDAO();

        while (true) {
            System.out.println("\n===== 헬스장 회원 관리 시스템 =====");
            System.out.println("1.회원등록 2.전체조회 3.출석(PT차감) 4.회원삭제 0.종료");
            System.out.print("메뉴 선택 : ");

            int menu = sc.nextInt();


            if (menu == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            switch (menu) {
                case 1:
                    System.out.println("\n==== 회원등록 ====");

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("이름: ");
                    String name = sc.next();

                    System.out.print("전화번호: ");
                    String phone = sc.next();

                    System.out.print("PT 횟수: ");
                    int pt = sc.nextInt();

                    dao.insertMember(id, name, phone, pt);
                    break;

                case 2:
                    System.out.println("\n==== 회원조회 ====");
                    List<MemberDTO> list = dao.selectAll();
                    System.out.println("ID | 이름 | 전화번호 | 등록일 | PT잔여");
                    for (MemberDTO m : list) {
                        System.out.printf("%d | %s | %s | %s | %d\n", m.getMemberId(), m.getName(), m.getPhone(), m.getStartDate(), m.getPtCount());
                    }
                    break;

                case 3:
                    System.out.println("\n==== 출석(PT) ====");
                    System.out.print("출석 처리할 회원 ID: ");
                    int useId = sc.nextInt();
                    dao.updatePT(useId);
                    break;

                case 4:
                    System.out.println("\n==== 회원삭제 ====");
                    System.out.print("삭제할 회원 ID: ");
                    int delId = sc.nextInt();
                    dao.deleteMember(delId);
                    break;

                default:
                    System.out.println("잘못된 번호입니다");
            }

        }

        System.out.println("시스템을 종료합니다");
        sc.close();
    }
}
