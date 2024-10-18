package mulitThreading;

public class withouttheadingVSthrading {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args) {
        int numThreads = 16; // Number of threads
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                for (int j = threadId * 100 / numThreads + 1; j <= (threadId + 1) * 100 / numThreads; j++) {
                    System.out.println(j);
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
