package ThreadExam02;
import java.io.*;

public class FileReaderTask implements Runnable {

    @Override
    public void run() {
        try (FileReader reader = new FileReader("input.txt")){

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
