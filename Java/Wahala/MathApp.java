public class MathApp{

    double numberOne = 10;
    double numberTwo = 5;

    public static double add(double numberOne, double numberTwo){
        double total = 0;
        total = numberOne + numberTwo;
    
    return total;
    }
    
    public static double subtract(double numberOne, double numberTwo){
        double total = 0;
        total = numberOne - numberTwo;
            if(numberTwo > numberOne)
            total = numberTwo - numberOne;
    
    return total;
    }
    
    public static double multiply(double numberOne, double numberTwo){
        double total = 1;
        total = numberOne * numberTwo;
        
    return total;
    }
    
    public static double divide(double numberOne, double numberTwo){
        double total = 0;
        if(numberTwo == 0) throw new IllegalArgumentException("Cannot divide by zero");
        total = numberOne / numberTwo;
    
    return total;
    }
    
    public double getOperator(char operator){
    if(operator == '+'){
    return add(numberOne, numberTwo);
    }
    
    else if(operator == '-'){
    return subtract(numberOne, numberTwo);
    }
    
    else if(operator == '*'){
    return multiply(numberOne, numberTwo);
    }
    
    else if(operator == '/'){
    return divide(numberOne, numberTwo);
    }
    
    else{
    throw new IllegalArgumentException("Invalid operator");
    }
    
    }
}
