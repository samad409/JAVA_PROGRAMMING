import java.util.Scanner;

// Thread using "extends Thread" for multiplication table of 5
class MultiplicationTable extends Thread {
    public void run() {
        System.out.println("\nMultiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(500); // Sleep for 500ms to simulate processing
            } catch (InterruptedException e) {
                System.out.println("Multiplication thread interrupted.");
            }
        }
    }
}

// Thread using "implements Runnable" for generating prime numbers
class PrimeNumbers implements Runnable {
    private int count;

    PrimeNumbers(int count) {
        this.count = count;
    }

    public void run() {
        System.out.println("\nFirst " + count + " Prime Numbers:");
        int num = 2, primeCount = 0;
        while (primeCount < count) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                primeCount++;
                try {
                    Thread.sleep(300); // Sleep for 300ms to simulate processing
                } catch (InterruptedException e) {
                    System.out.println("Prime thread interrupted.");
                }
            }
            num++;
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// Main class to start both threads
public class Multithreading{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for prime numbers
        System.out.print("Enter the number of prime numbers to generate: ");
        int n = scanner.nextInt();

        // Creating thread objects
        MultiplicationTable tableThread = new MultiplicationTable();
        Thread primeThread = new Thread(new PrimeNumbers(n));

        // Starting both threads
        tableThread.start();
        primeThread.start();

        // Ensuring both threads complete execution before continuing
        try {
            tableThread.join();
            primeThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nBoth threads have finished execution.");
        scanner.close();
    }
}
