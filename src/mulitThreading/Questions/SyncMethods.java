package mulitThreading.Questions;

public class SyncMethods {

    public synchronized void display(){
        System.out.println(Thread.currentThread().getName() + " is sync methods");

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SyncMethods syncMethods = new SyncMethods();
        syncMethods.display();
    }
}
