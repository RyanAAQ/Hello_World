public class TaskFour{
    public static void main(String[] args){
    
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int largest = getLargestAtEvenIndexes(numbers);

    System.out.println("Largest number at even indexes: " + largest);
}
    public static int getLargestAtEvenIndexes(int[] numbers) {
    int largest = numbers;
    
    if (numbers[i] > largest) {
    largest = numbers[i];
}
}
    return largest;
    }
}
