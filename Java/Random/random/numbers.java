import java.util.Scanner;

public class numbers{
    public static void main(String... args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int number = input.nextInt();

    for(int mainloop = 1; mainloop <= number; mainloop++){
    for (int innerloop = number; innerloop >= 1; innerloop--){
 
    if (mainloop <= innerloop) 
    System.out.print("");

    else
    System.out.print(innerloop);
}  

    for (int row = 1; row <= number; row++){
    for (int space = 1; space <= number - row; space++){
    System.out.print(" ");
}
    for(int numbers = 1; numbers <= row; numbers++);
    System.out.print(row);
}
    System.out.println();
        }
    }
}
