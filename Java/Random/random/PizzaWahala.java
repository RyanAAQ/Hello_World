import java.util.Scanner;

public class PizzaWahala{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("""
    
    ====================================================
    WELCOME TO RYAN'S PIZZAHUB WHERE TASTE MEETS TECH :)
    ====================================================
    WHAT WOULD YOU LIKE TO ORDER
    1. Sapa size
    2. Small money
    3. Big boys
    4. Odogwu size
    0. Exit
    """);
    int type = input.nextInt();

    if(type >= 5){
    System.out.print("INVALID INPUT, PLEASE TRY AGAIN :)");
}

    if (type == 0){
    System.out.print("THANKS FOR ORDERING, PLEASE COME BACK SOON");
    }

    if (type > 0 && type <= 4){
    int slicesperbox = 0;
    int priceperbox = 0;

    if (type == 1){
    System.out.println("""
    Sapa size selected
    Inludes 4 slices per box
    Price = 2500
    """);
    slicesperbox = 4;
    priceperbox = 2500;

}   else if (type == 2){
    System.out.println("""
    Small money box selected
    Includes 6 slices
    Price = 2900
    """);
    slicesperbox = 6;
    priceperbox = 2900;

}  else if (type == 3){
    System.out.println("""
    Big Boys box selected
    Includes 8 slices
    Price = 4000
    """);
    slicesperbox = 8;
    priceperbox = 4000;

}   else if (type == 4){
    System.out.println("""
    Odogwu box selected
    Includes 12 slices
    Price = 5200
    """);
    slicesperbox = 12;
    priceperbox = 5200;
}  

    System.out.print("Number of guests: ");
    int guests = input.nextInt();

    int boxes = guests / slicesperbox;
    if (guests % slicesperbox != 0) {
    boxes++;
}

    int total = boxes * slicesperbox;
    int leftovers = total - guests;
    int totalprice = boxes * priceperbox;

    System.out.println("Number of boxes of pizza to buy = " + boxes + " boxes");
    System.out.println("Left over slices after serving = " + leftovers + " slices");
    System.out.println("Price = " + totalprice);
    }
    }
}

