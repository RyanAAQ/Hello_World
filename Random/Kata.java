public class Kata {
    public static void main(String[] args) {
        // To call these, we provide the types and use the method names
        maximum(419, 234);
        isEven(234);
        subtract(333, 999);
        divide(23, 0);
    }

    public static int maximum(int firstNumber, int secondNumber) {
        int maxNumber = firstNumber; // Removed extra 'int'
        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }
        System.out.printf("The Maximum number = %d%n", maxNumber);
        return maxNumber;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.printf("The integer %d is Even%n", number);
            return true; // Must return a boolean (true/false)
        } else {
            System.out.printf("The integer %d is Odd%n", number);
            return false;
        }
    }

    public static int subtract(int firstNumber, int secondNumber) {
        int minus = Math.abs(firstNumber - secondNumber);
        System.out.printf("The difference = %d%n", minus);
        return minus;
    }

    public static float divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("0");
            return 0;
        }
        // Cast to float so we get decimals (e.g., 5/2 = 2.5, not 2)
        float division = (float) firstNumber / secondNumber;
        System.out.printf("The quotient = %.3f%n", division);
        return division;
    }
}

