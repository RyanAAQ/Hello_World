public class TaskSix{
    public static void main(String[] args) {
    
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = sumEven(numbers);

    System.out.println("Sum of numbers at even indexes: " + sum);
}
    public static int sumEven(int[] numbers){
    int sum = 0;
    for (int i = 0; i < numbers.length; i += 2){
    sum += numbers[i];
}
    return sum;
    }
}
