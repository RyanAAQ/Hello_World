import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

int result = 0;

while (result != 1 && result != 2) {
System.out.print("Enter result 1 to pass and 2 to fail: ");
result = input.nextInt();

if (result != 1 && result != 2) {
System.out.println("Invalid input");
    }
}
System.out.println("Valid input :)");
    }
}

