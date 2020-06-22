package _18_threading.simple_thread;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int index = 0; index < 10; index++) {
            System.out.println("value: " + index + " - hash code: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new NumberGenerator());
        Thread thread1 = new Thread(new NumberGenerator());
        thread.start();
        thread1.start();
    }
}
