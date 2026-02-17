// Thread complete demonstration

class Counter {
    int count = 0;

    // unsafe increment (race condition)
    void incrementUnsafe() {
        count++;
    }

    // safe increment (synchronized)
    synchronized void incrementSafe() {
        count++;
    }
}

class Worker implements Runnable {

    String name;
    Counter counter;
    boolean safe;

    Worker(String name, Counter counter, boolean safe) {
        this.name = name;
        this.counter = counter;
        this.safe = safe;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(name + " running step " + i);

            // demonstrate yield
            Thread.yield();

            // race condition demo
            for (int j = 0; j < 1000; j++) {
                if (safe)
                    counter.incrementSafe();
                else
                    counter.incrementUnsafe();
            }

            // demonstrate sleep
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }

        System.out.println(name + " finished");
    }
}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        System.out.println("=== STARTING THREADS ===");

        // Thread using Runnable class
        Thread t1 = new Thread(new Worker("Thread-A", counter, false));
        Thread t2 = new Thread(new Worker("Thread-B", counter, false));

        t1.start();
        t2.start();

        // join demonstration
        t1.join();
        t2.join();

        System.out.println("\nFinal Counter (Race Condition Expected): " + counter.count);

        // Reset counter
        counter.count = 0;

        System.out.println("\n=== FIXING WITH SYNCHRONIZATION ===");

        Thread t3 = new Thread(new Worker("Thread-C", counter, true));
        Thread t4 = new Thread(new Worker("Thread-D", counter, true));

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("\nFinal Counter (Synchronized Correct): " + counter.count);

        // Lambda thread
        Thread lambdaThread = new Thread(() -> {
            System.out.println("\nLambda thread running");
        });

        lambdaThread.start();
        lambdaThread.join();

        System.out.println("\n=== MAIN THREAD FINISHED ===");
    }
}
