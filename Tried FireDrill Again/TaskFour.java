public class TaskFour {
    public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] result = getEven(numbers);

    System.out.print("Numbers at even indexes: ");
    for (int num : result) {
    System.out.print(" " + num);
    }
    System.out.println();
}

    public static int[] getEven(int[] numbers) {
    int count = 0;
    for (int i = 0; i < numbers.length; i += 2) {
    count++;
}
    int[] result = new int[count];
    int index = 0;
    for (int i = 0; i < numbers.length; i += 2) {
    result[index++] = numbers[i];
    }

    return result;
    }
}
