package mulitThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class threadpool {

    static class RequestHandler implements Runnable {
        private final String request;

        public RequestHandler(String request) {
            this.request = request;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " processing request: " + request);
            try {
                // Simulate some processing time
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Request " + request + " was interrupted.");
            }
            System.out.println(Thread.currentThread().getName() + " completed request: " + request);
        }
    }
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        // Simulate incoming requests
        for (int i = 1; i <= 10; i++) {
            threadPool.submit(new RequestHandler("Request-" + i));
        }

        // Shutdown the thread pool after all tasks are submitted
        threadPool.shutdown();

        try {
            // Wait for all tasks to finish
            if (!threadPool.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Not all requests were completed in time, forcing shutdown...");
                threadPool.shutdownNow();
            }
        } catch (InterruptedException e) {
            threadPool.shutdownNow();
        }

        System.out.println("All requests processed.");
    }
}
