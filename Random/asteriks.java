import java.util.Scanner;

public class Aisosa{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter angle number: ");
    int num = input.nextInt();

    for(int outerloop = 1; outerloop <= num; outerloop++){
    for(int index = num; index >= 1; index++){

    if (outerloop < index)
    System.out.print("");

    else
    System.out.print(index);
}
 System.out.println();
    }
}
}
