public class ThreadStatesDemo {
    
    public static void main(String[] args) {
        // Create and start multiple threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread-1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread-2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread-3");

        // Print the initial states of threads
        printThreadState(thread1);
        printThreadState(thread2);
        printThreadState(thread3);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Sleep to allow threads to change states
            Thread.sleep(500);

            // Print thread states after a while
            printThreadState(thread1);
            printThreadState(thread2);
            printThreadState(thread3);

            // Wait for threads to finish before printing final states
            thread1.join();
            thread2.join();
            thread3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final states after threads finish
        printThreadState(thread1);
        printThreadState(thread2);
        printThreadState(thread3);
    }

    // Method to print the state of a thread
    private static void printThreadState(Thread thread) {
        String threadInfo = String.format("%s - State: %s", thread.getName(), thread.getState());
        System.out.println(threadInfo);
    }

    // A simple runnable that causes the thread to sleep and change states
    static class MyRunnable implements Runnable {
        public void run() {
            try {
                // Print the state when the thread starts
                printThreadState(Thread.currentThread());
                
                // Simulate work by making the thread sleep for a while
                Thread.sleep(2000);

                // Print the state after sleeping
                printThreadState(Thread.currentThread());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
