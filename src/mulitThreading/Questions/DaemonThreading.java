package mulitThreading.Questions;


//A daemon thread is a thread that runs in the background and is typically used for background tasks. When the only threads running in a program are daemon threads, the program will exit.

public class DaemonThreading extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        
    }

    public static void main(String[] args) {
        DaemonThreading daemonThreading = new DaemonThreading();
        daemonThreading.setDaemon(true);
        daemonThreading.start();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting.");
    }
}
