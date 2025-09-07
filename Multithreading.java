class Morning extends Thread {
    public void run() {
        try {
            while (true) { 
                System.out.println("Good morning!");
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Morning thread interrupted");
        }
    }
}

class Afternoon extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Good afternoon!");
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Afternoon thread interrupted");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Morning m = new Morning();
        Afternoon a = new Afternoon();
        
        m.start();
        a.start();
    }
}
