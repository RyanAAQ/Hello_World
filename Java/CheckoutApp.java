import java.util.Scanner;

public class CheckoutApp {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String[] userItems = new String[100];
    int[] itemQuantity = new int[100];
    double[] itemPrice = new double[100];
    double[] total = new double[100];
    
    System.out.println("=============== WELCOME TO SEMICOLON SUPERSTORES ================");

    int index = 0;

    System.out.print("Enter customer name: ");
    String customer = input.nextLine();

    do {
    System.out.print("Enter product name: ");
    userItems[index] = input.next();

    System.out.print("Enter Item Price: ");
    itemPrice[index] = input.nextDouble();

    System.out.print("Enter quantity: ");
    itemQuantity[index] = input.nextInt();

    total[index] = itemPrice[index] * itemQuantity[index];
    index++;

    System.out.print("Add more items? (yes/no): ");
    String choice = input.next();
    if (choice.equalsIgnoreCase("no")) break;

    } while (index < 100);

    double subtotal = 0;
    for (int count = 0; count < index; count++) {
    subtotal += total[count];
}

    double discount = subtotal * 0.10;
    double vat = subtotal * 0.075;
    double billTotal = subtotal - discount + vat;

    System.out.println("\n===== RECEIPT =====");
    System.out.println("Customer name: " + customer);
    System.out.println("-------------------------");

    for (int count = 0; count < index; count++) {
    System.out.println(userItems[count] + " x" + itemQuantity[count] + " @ " + itemPrice[count] + " = " + total[count]);
}

    System.out.println("-------------------------");
    System.out.printf("Subtotal: %.2f\n", subtotal);
    System.out.printf("Discount: %.2f\n", discount);
    System.out.printf("VAT (7.5%%): %.2f\n", vat);
    System.out.printf("Bill Total: %.2f\n", billTotal);

    System.out.print("Amount Paid: ");
    double paid = input.nextDouble();

    double balance = paid - billTotal;

    System.out.printf("Balance: %.2f\n", balance);
    System.out.println("==================");
    System.out.println("    THANK YOU");

    }
}

