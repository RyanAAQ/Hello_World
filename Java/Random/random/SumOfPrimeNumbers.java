import java.util.Scanner;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your number: ");
    int num = input.nextInt();
    int sum = 0;
    int count = 2;

while(count <= num) {
     int remainder = num % count;
  if(remainder == 0 ){
  num = num / count;
  sum = sum + count;
}
else
count++;
}
System.out.println(sum);
}
}
