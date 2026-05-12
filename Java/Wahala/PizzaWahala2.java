import java.util.Scanner;

public class PizzaWahala2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    System.out.println("=================================");
    System.out.println("   WELCOME TO RYAN'S PIZZA HUB, WHERE TASTE MEETS TECH :)      ");
    System.out.println("=================================");
    System.out.println("\nAvailable Pizza Types:");
    System.out.println("1. Sapa size (4 slices, $2,500)");
    System.out.println("2. Small Money (6 slices, $2,900)");
    System.out.println("3. Big boys (8 slices, $4,000)");
    System.out.println("4. Odogwu (12 slices, $5,200)");
        
    System.out.print("Select a pizza type: ");
    int choice = input.nextInt();
        
    System.out.print("Enter number of guests: ");
    int guests = input.nextInt();
    
    int slicesperbox = 0;
    int priceperbox = 0;
    String pizzatype = "";
    
    switch(choice) {
        case 1:
        slicesperbox = 4;
        priceperbox = 2500;
        pizzatype = "Sapa size";
        break;
    
        case 2:
        slicesperbox = 6;
        priceperbox = 2900;
        pizzatype = "Small Money";
        break;
    
        case 3:
        slicesperbox = 8;
        priceperbox = 4000;
        pizzatype = "Big boys";
        break;
      
        case 4:
        slicesperbox = 12;
        priceperbox = 5200;
        pizzatype = "Odogwu";
        break;
            
        default:
        System.out.println("Invalid choice, please try again later");
        break;
}
        int box = checkfornumberofboxes(slicesperbox, guests);
        int leftoverslice = checkforleftover(slicesperbox, guests);
        int totalPrice = checkforprice(slicesperbox, guests, priceperbox);
        

        System.out.println("Boxes needed = " + box);
        System.out.println("Leftover slices = " + leftoverslice);
        System.out.println("Total price = " + totalPrice);
    }
    
    public static int checkfornumberofboxes(int sliceperbox, int guests) {
        int boxes = guests / sliceperbox;
        if (guests % sliceperbox != 0) 
            boxes++;
        return boxes;
    }
   
    public static int checkforleftover(int sliceperbox, int guests) {
        int boxes = checkfornumberofboxes(sliceperbox, guests);
        int totalSlices = boxes * sliceperbox;
        return totalSlices - guests;
    }
    public static int checkforprice(int sliceperbox, int guests, int priceperbox) {
        int boxes = checkfornumberofboxes(sliceperbox, guests);
        int totalprice = boxes * priceperbox;
        return totalprice;
    }
}
