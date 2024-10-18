package mulitThreading.Questions;

public class RaceCondition {
    private int count = 0;

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
    public static void main(String[] args) {
        RaceCondition raceCondition = new RaceCondition();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10; i++){
                raceCondition.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10; i++){
                raceCondition.increment();
            }
        });

        t1.start();//this start method should be used for multi taskign for the better speed.
        t2.start();

        try{
            t1.join();//this indicate that one should most be stopeed when one method are executing
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("final count : " + raceCondition.getCount());
    }
}

