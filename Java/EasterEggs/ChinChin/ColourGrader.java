import java.util.Random;

    public class ColourGrader{
        public static void main(String[] args){

    Random input = new Random();
    int number = input.nextInt(7);

    String colour;
    
    if (number == 1) 
    colour = "violet";
    
    else if (number == 2)
    colour = "indigo";

    else if (number == 3)
    colour = "blue";

    else if (number == 4)
    colour = "green";
    
    else if (number == 5)
    colour = "yellow";
    
    else if (number == 6)
    colour = "orange";

    else
    colour = "red";

    System.out.println("Number " + number + " = " + colour);

    }
}
