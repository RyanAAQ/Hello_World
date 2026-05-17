import java.util.Scanner;

public class MathAppMain{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);

    while(true){
    System.out.println("""
    
-----------------Welcome to Calculator-----------------
Choose Your Operand Or $ to close
1. +
2. -
3. *
4. /   
    """
    );
    char operand = input.next().charAt(0);
    
    System.out.print("Enter the first number: ");
    double numberOne = input.nextDouble();

    System.out.print("Enter the second number: ");
    double numberTwo = input.nextDouble();
    
    double add = 0;
    double subtract;
    double multiply = 1;
    double divide;
    
    if(operand == '$'){
    break;
    }
    
    else if(operand == '+'){
    add = MathApp.add(numberOne, numberTwo);
    System.out.print(add);
  }   
        
    else if(operand == '-'){
    add = MathApp.subtract(numberOne, numberTwo);
    }
    System.out.print(add);
    }
}
}
