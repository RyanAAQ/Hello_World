import java.util.Scanner;

public class CreditLimit{
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

System.out.print("Enter account number (-1 to quit): ");
int accountNumber = input.nextInt();

while (accountNumber != -1){
    System.out.print("Enter starting balance: ");
    int beginningBalance = input.nextInt();

    System.out.print("Enter the total charges: ");
    int charges = input.nextInt();

    System.out.print("Enter the total credits: ");
    int credits = input.nextInt();

    System.out.print("Enter the credit limit: ");
    int limit = input.nextInt();

    int newBalance = beginningBalance + charges - credits;
    System.out.println("New balance =" + newBalance);

    if (newBalance > limit) {
    System.out.println("Credit limit exceeded");
}
    System.out.print("\nEnter account number or -1 to quit: ");
    accountNumber = input.nextInt();
        }
    }
}

