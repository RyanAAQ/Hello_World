import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    int [] array = new int[10];
    
    for(int count = 0; count < 10; count++){
        System.out.print("Enter 10 numbers: ");
        array[count] = input.nextInt();
    }
    System.out.println(array[0]);
        int left = 0;
        int right = array.length - 1;
    
    while(left < right){
        int temporary = array[left];
        array[left] = array[right];
        array[right] = temporary;
    
    left++;
    right--;
    }
    System.out.print(array[0]);
    System.out.print(Arrays.toString(array));
    }
}
