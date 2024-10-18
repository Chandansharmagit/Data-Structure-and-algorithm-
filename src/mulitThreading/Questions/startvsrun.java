package mulitThreading.Questions;

public class startvsrun extends Thread{
    public void run(){
        System.out.println("Running in thread " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        startvsrun obj = new startvsrun();
        obj.run();
        obj.start();
    }
}
