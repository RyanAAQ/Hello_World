import java.util.Scanner;
import java.util.Arrays;

public class FireDrill{

    public static int [] TaskOne(Scanner input){
    int [] array = new int[10];
    for(int i = 0; i < 10; i++){
    array[i] = input.nextInt();
    }
    return array;
}

    public static int [] TaskTwo(int [] numbers){
    int left = 0;
    int right = numbers.length - 1;

    while(left < right){
    int temporary = numbers[left];
    numbers[left] = numbers[right];
    numbers[right] = temporary;

    left++;
    right--;
     }
    return numbers;
    }
    
    public static int [] TaskThree(int [] numbers){
    int count = 0;
    for (int num : numbers) {
    if (num % 2 != 0)
    count++;
}

    int[] odd = new int[count];
    int index = 0;
    for (int num : numbers) {
    if (num % 2 != 0) {
    odd[index++] = num;
        }
    }
    return odd;
    }
    
    public static int [] TaskFour(int [] numbers){
    int count = 0;
    for (int num : numbers) {
    if (num % 2 == 0)
    count++;
}

    int[] even = new int[count];
    int index = 0;
    for (int num : numbers) {
    if (num % 2 == 0)
    even[index++] = num;
}    
    return even;

} 
    public static int [] TaskFive(int [] numbers){
    for(int i = 0; i < numbers.length; i++){
    if(numbers[i] == i) {
        }
    }
    return numbers;
    }
    
    public static int [] TaskSix(int [] numbers){
    Arrays.sort(numbers);
    return numbers;
    }
}


