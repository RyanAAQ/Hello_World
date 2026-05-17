public class Something{
    public static void main(String[] args) {
    
    int[] numbers = {1, 3, 3445, 7, 9, 11, 13, 15, 17, 19, 20, 2, 22, 34, 56};
    int[] oddNumbers = getOddNumbers(numbers);
    System.out.print("Even numbers: ");
    for (int num : oddNumbers) {
    System.out.print(" " + num);
}
    System.out.println();
}
    public static int[] getOddNumbers(int[] numbers) {
    int count = 0;
    for (int number : numbers) {
    if (number % 2 == 0) {
    count++;
    }
}
    int[] result = new int[];
    int index = 0;
    for (int num : numbers) {
    if (num % 2 == 0) {
    result[index++] = num;
}
}
return result;
    }


}

