import java.util.Scanner;

public class menstrualApp {
    public static void main(String... args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter what day of the month last period came: ");
    int lastperiod = input.nextInt();

    System.out.print("Enter how long your cycle is on average: ");
    int periodcycle = input.nextInt();

    System.out.print("Enter how long your period lasts is on average: ");
    int periodlength = input.nextInt();

    int nextperiod = lastperiod + periodcycle;
    int ovulation = lastperiod + (periodcycle / 2);
    int fertilityday = ovulation - 2;
    int fertilitystop = ovulation + 2;
    
    int choice;
    do {
    System.out.println("\n--- Menstrual Cycle App ---");
    System.out.println("1. View Next Period Day");
    System.out.println("2. View Ovulation Day");
    System.out.println("3. View Fertile Window");
    System.out.println("4. View Safe Periods");
    System.out.println("5. Close app");
    System.out.print("Choose an option: ");
    choice = input.nextInt();

    switch (choice) {
    case 1:
    System.out.println("Your next period day: " + nextperiod);
    break;
    case 2:
    System.out.println("Your next ovulation day: " + ovulation);
    break;
    case 3:
    System.out.println("Your fertile window is from day " + fertilityday + " to day " + fertilitystop);
    break;
    case 4:
    System.out.println("Your safe period is before day " + fertilityday + " and after day " + fertilitystop);
    break;
    case 5:
    System.out.println("Closng app.");
    break;
    default:
    System.out.println("Invalid choice, try again.");
    }
} while (choice != 5);
    }
}

