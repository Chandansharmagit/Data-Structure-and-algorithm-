package mulitThreading.Questions;

public class Priority extends Thread {
    public void run(){
        System.out.println("Priority thread" + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Priority priority = new Priority();
        Priority priority1 = new Priority();
        priority.setPriority(MAX_PRIORITY);
        priority1.setPriority(MIN_PRIORITY);
        priority.start();
        priority1.start();
    }
}
