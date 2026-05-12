public class TaskSeven{
    public static void main(String[] args) {
    
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = sumOdd(numbers);

    System.out.println("Sum of numbers at Odd indexes: " + sum);
}
    public static int sumOdd(int[] numbers) {
    int sum = 0;
    for (int i = 1; i < numbers.length; i += 2) {
    sum += numbers[i];
}
    return sum;
    }
}
