import java.util.Scanner;

public class DuplicateElimination{
    public static void main(String[] args){
        int[] array = new int[10];

    for (int index = 0; index < array.length; index++){
    array[index] = -1;
}

    Scanner input = new Scanner(System.in);

    for (int count = 0; count < 10;){
    System.out.print("Enter 10 numbers from 10-100: ");
    int numbers = input.nextInt();

    if (numbers >= 10 && numbers <= 100){
    array[count] = numbers;
    count++;
 }   
    else if(numbers == -1){
    System.out.print("Invalid number");
    break;
    }
}
    for(int index = 1; index < array.length; index++){
    if(array[index] == 0)
    System.out.print(array[index] + " ");
    }
    }
}

