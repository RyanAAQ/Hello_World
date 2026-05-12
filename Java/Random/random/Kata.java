public class Kata {
    public static void main(String[] args) {

        maximum(100, 99);
        isPrime(10);
        isEven(567);
        subtract(445, 765);
        divide(15, 5);
        factorOf(10);
        isPerfectSquare(25);
        isPalindrome(12321);
        factorialOf(5);
        squareOf(5);
}

    public static int maximum(int firstNumber, int secondNumber) {
        int maxNumber = firstNumber;
        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
    }
        System.out.printf("The Maximum number = %d%n", maxNumber);
        return maxNumber;
}

    public static boolean isPrime(int number){
    if (number <= 1)
        return false;
            for (int num = 2; num <= Math.sqrt(number); num++){
        if (number % num == 0){
        return false;
        }
    }
    System.out.printf("The number %d%nis a prime number%n", number);
    return true;
}

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.printf("The integer %d is Even%n", number);
            return true; 
        } else {
            System.out.printf("The integer %d is Odd%n", number);
            return false;
    }
}
    public static int subtract(int firstNumber, int secondNumber) {
        int minus = (firstNumber - secondNumber);
        if (secondNumber > firstNumber){
        minus = (secondNumber - firstNumber);
        System.out.printf("The differnce = %d%n", minus);
        return minus;

        } else{
        System.out.printf("The difference = %d%n", minus);
        return minus;
    }
}

    public static float divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("0");
            return 0;
    }
        float division = (float) firstNumber / secondNumber;
        System.out.printf("The quotient = %.3f%n", division);
        return division;
}

    public static int factorOf(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
        }
    }
        System.out.printf("The number of factors = %d%n", count);
        return count;
}

    public static boolean isPerfectSquare(int number) {
        int squareRoot = (int) Math.sqrt(number);
        boolean check = (squareRoot * squareRoot == number);
        System.out.printf("The result for perfect square = %b%n", check);
        return check;
}

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
    }
        boolean check = (originalNumber == reversedNumber);
        System.out.printf("The result for palindrome = %b%n", check);
        return check;
}

    public static long factorialOf(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
    }
        System.out.printf("The factorial = %d%n", factorial);
        return factorial;
}

    public static long squareOf(int number) {
        long result = (long) number * number;
        System.out.printf("The square = %d%n", result);
        return result;
    }
}

