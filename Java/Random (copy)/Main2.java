import java.util.Scanner;

public class Main2{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int i = 1;
    int toto = 0;

    while (i <= 10){
    System.out.print("Enter 10 numbers: ");
    int scores = input.nextInt();
    
    toto = toto + scores / 10;

i++;
   }
    System.out.println(toto);
}
}
