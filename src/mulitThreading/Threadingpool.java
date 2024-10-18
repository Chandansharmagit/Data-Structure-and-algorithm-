package mulitThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadingpool {
    // Task that simulates some work
    static class SimpleTask implements Runnable {
        private final String taskName;

        public SimpleTask(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is executing " + taskName);
            try {
                // Simulate work by sleeping for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
            System.out.println(Thread.currentThread().getName() + " finished " + taskName);
        }
    }

    public static void main(String[] args) {
        // Create a thread pool with 2 threads
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        // Submit 5 tasks to the pool
        for (int i = 1; i <= 5; i++) {
            SimpleTask task = new SimpleTask("Task-" + i);
            threadPool.submit(task);
        }

        // Shut down the thread pool once all tasks are submitted
        threadPool.shutdown();

        System.out.println("All tasks submitted.");
    }
}
