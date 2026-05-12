import java.util.Scanner;

    public class Test{
        public static void main(String[] args){
    Scanner Tunde = new Scanner(System.in);

    int count = 1;
    int total = 0;

    while (count <= 10){
    System.out.println("Enter a number: ");
    int sum = Tunde.nextInt();
    total = total + count;
count++;

}
    System.out.println("The sum of the numbers is " + total);
    }
}
