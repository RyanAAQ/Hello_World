import java.util.Scanner;

public class Aisosa{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    for(int mainloop = 1; mainloop <= num; mainloop++){
    for (int innerloop = num; innerloop >= 1; innerloop--){
 
    if (mainloop <= innerloop) 
    System.out.print("*");

    else
    System.out.print(" ");
    
}
    System.out.println();
        }
    }
}
