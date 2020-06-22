package _18_threading.even_odd;

public class OddThread extends Thread {
    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
