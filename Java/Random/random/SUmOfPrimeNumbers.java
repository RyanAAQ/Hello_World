import java.util.Scanner;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of prime numbers up to " + num + " is: " + sum);
        input.close();
    }

    // Helper method
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
