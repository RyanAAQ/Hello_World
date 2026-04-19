import java.util.Scanner;

public class RaisedToPowerTwo{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    int power = 1;

    for (int i = 1; i <= num; i++){
    
    power = power * 2;

    System.out.print("2 raised to power " + i + " = " + power);

}

    }
}
