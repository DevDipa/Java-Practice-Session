class Resource {
    private int count = 0;

    // synchronized to avoid race condition
    //gives random, smaller values than 2000 when left unsynchronized
    public synchronized void increment() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

class SyncTest extends Thread {
    Resource counter;

    SyncTest(Resource obj) {
        counter = obj;
    }

    public void run() {
        counter.increment();
    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Resource c = new Resource();

        SyncTest t1 = new SyncTest(c);
        SyncTest t2 = new SyncTest(c);

        t1.start();
        t2.start();

        try {
            t1.join();   // wait for t1
            t2.join();   // wait for t2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The final count value is: " + c.getCount());
    }
}
