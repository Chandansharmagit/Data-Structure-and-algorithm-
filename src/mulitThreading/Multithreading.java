package mulitThreading;

public class Multithreading extends Thread {
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String[] args) {
        Multithreading thread = new Multithreading();
        thread.start();
        thread.interrupt();

        Myrunnable myrunnable = new Myrunnable();
        Thread thread1 = new Thread(myrunnable);
        thread1.start();
    }

}

class Myrunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("my runnable is working");
    }
}