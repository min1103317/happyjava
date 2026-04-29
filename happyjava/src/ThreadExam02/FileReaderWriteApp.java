package ThreadExam02;

public class FileReaderWriteApp {
    public static void main(String[] args) {

        Thread FileReader = new Thread(new FileReaderTask());
        Thread FileWriter = new Thread(new FileWriterTask());
        FileReader.start();
        FileWriter.start();
    }
}
