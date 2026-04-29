package ThreadExam;

class myRunnable implements Runnable{
    private String name;
    public myRunnable(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.printf("%s\n",name);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExam01 {
    public static void main(String[] args) {
        System.out.println("main start");
        myRunnable r1 = new myRunnable("name-1");
        myRunnable r2 = new myRunnable("name-2");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();


    }

}
