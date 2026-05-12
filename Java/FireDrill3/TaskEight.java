public class TaskEight{
    public static void main(String[] args) {
    
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20};
    int[] EvenNumbers = getEvenNumbers(numbers);
    int largest = numbers[0];
    
    for(int counter = 1; counter < numbers.length; counter++){
    if(numbers[counter] > largest)
    largest = numbers[counter];
    }
    System.out.println("Largest = " + largest);
    
    System.out.print("Even numbers = ");
    for (int num : EvenNumbers) {
    System.out.print(" " + num);
}
    System.out.println();
}
    public static int[] getEvenNumbers(int[] numbers) {
    int count = 0;
    for (int number : numbers) {
    if (number % 2 == 0) {
    count++;
    }
}
    int[] result = new int[count];
    int index = 0;
    for (int num : numbers) {
    if (num % 2 == 0) {
    result[index++] = num;
    }
}
    return result;
}
}
