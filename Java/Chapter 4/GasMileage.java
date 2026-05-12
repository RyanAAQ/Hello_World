// declare total miles and total gallons to zero
//prompt the user to input the miles
// use a while loop to stop the code when user input is -1
//prompt user to input the gallons used
// add miles to total miles and gallons to total gallons
//print the miles per gallon and prompt user to enter more inputs

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
int totalMiles = 0, totalGallons = 0;

System.out.print("Enter miles driven or -1 to quit: ");
int miles = input.nextInt();

while (miles != -1) {
System.out.print("Enter gallons: ");
int gallons = input.nextInt();

if (gallons != 0) {
int milespergallon = miles / gallons;
System.out.print("The miles per gallon for the drive ="+milespergallon);

totalMiles += miles;
totalGallons += gallons;
int totalMpg = totalMiles / totalGallons;
System.out.println("Total miles per gallon ="+totalMpg);
            }

            System.out.print("Enter miles driven or -1 to quit: ");
            miles = input.nextInt();
        }
    }
}

