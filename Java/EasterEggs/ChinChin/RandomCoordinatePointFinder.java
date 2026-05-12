import java.util.Random;

    public class RandomCoordinatePointFinder{
        public static void main(String[] args){

    Random rand = new Random();

    double x = (rand.nextDouble() * 50) - 25;
    double y = (rand.nextDouble() * 150) - 75;

    System.out.printf("Random point is (%.2f, %.2f)%n", x, y);

    }
}
