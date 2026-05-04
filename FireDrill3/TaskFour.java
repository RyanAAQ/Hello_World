public class TaskFour{
    public static void main(String[] args) {
    
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] EvenNumbers = getEvenNumbers(numbers);
    
    System.out.print("Even numbers: ");
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

