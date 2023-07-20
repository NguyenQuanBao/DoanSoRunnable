import java.awt.font.GraphicAttribute;

public class GuessRunnable implements Runnable {
    int guessNumber = 0;
    int count = 0;

    public GuessRunnable(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 20 + 1);
            count++;
            System.out.println(Thread.currentThread().getName() + " đoán sô " + randomNumber);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (randomNumber != guessNumber);
        System.out.println(Thread.currentThread().getName() + " đã đoán ra số " + guessNumber + " trong " + count + " lần đếm");
    }
}
