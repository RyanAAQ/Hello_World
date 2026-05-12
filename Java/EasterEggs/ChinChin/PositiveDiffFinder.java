import java.util.Random;

    public class PositiveDiffFinder{
        public static void main(String[] args){

    Random rand = new Random();
    int a = rand.nextInt(10);
    int b = rand.nextInt(10);

    int diff = Math.abs(a - b);

    System.out.println("NUmbers: " + a + " and " + b); 
    System.out.println("Positive difference is " + diff);

    }
}

    
