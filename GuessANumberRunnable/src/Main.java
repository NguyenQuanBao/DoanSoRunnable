import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn Thread đoán: ");
        int number = scanner.nextInt();

        GuessRunnable guessRunnable = new GuessRunnable(number);
        GuessRunnable guessRunnable1 = new GuessRunnable(number);

        Thread DoanSoS1 = new Thread(guessRunnable);
        Thread DoanSoS2 = new Thread(guessRunnable1);

        DoanSoS1.setName("S1");
        DoanSoS2.setName("S2");

        DoanSoS1.start();
        DoanSoS2.start();
    }
}