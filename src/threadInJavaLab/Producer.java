package threadInJavaLab;
public class Producer extends Thread {
    StringBuffer sb;
    Producer() {
        sb = new StringBuffer();
    }
    public void run() {
        synchronized (sb) {
            for (int i = 0; i <= 10; i++) {
                try {
                    sb.append(i + " ");
                    Thread.sleep(100);
                    System.out.println("appending");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            sb.notify(); // Notify waiting consumers when the producer is done
        }
    }
}
class Consumer extends Thread {
    Producer prod;
    Consumer(Producer prod) {
        this.prod = prod;
    }
    public void run() {
        synchronized (prod.sb) {
            try {
                prod.sb.wait(); // Wait for the producer to finish
                System.out.println(prod.sb);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 class Communicate {
    public static void main(String args[]) {
        Producer obj1 = new Producer();
        Consumer obj2 = new Consumer(obj1);
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        // Start both producer and consumer threads
        t1.start();
        t2.start();
    }
}
