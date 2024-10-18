package mulitThreading;


class task implements Runnable{
    public void run(){
        for(int i = 0; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + ": task " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class threadandrunnabletogethor {
    public static void main(String[] args) {
        Thread thread = new Thread(new task());
        Thread thread1 = new Thread(new task());
        thread.start();
        thread1.start();
    }
}
