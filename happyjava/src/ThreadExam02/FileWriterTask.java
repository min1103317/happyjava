package ThreadExam02;
import java.io.*;
import java.util.Scanner;

public class FileWriterTask implements Runnable {
    @Override
    public void run() {

        try (Scanner sc = new Scanner(System.in);
             FileWriter fw = new FileWriter("output.txt" , true)) {

            System.out.println("\n=====0번(저장후 프로그램 종료)=====");
            System.out.println("입력 : ");

            while (true) {

                String input = sc.nextLine();

                if (input.equals("0")) {
                    System.out.println("파일저장 완료");
                    break;
                }

                fw.write(input + "\n");

            }
            System.out.println("프로그램을 종료합니다");
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
