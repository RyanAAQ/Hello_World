import java.util.Scanner;

public class OshoFreePromoEngineMain{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("""
    
================ WELCOME TO IYA SCAMBIRA'S JOINT =================
    
    CART TOTAL          DISCOUNT        PROMO CODE
_________________________________________________________

1. BELOW $5000       |   0%     |       NOT APPLICABLE

2. $5000 - $14,999   |   10%    |       STARTER10

3. $15000 - $29,999  |   20%    |       BIGBOY20

4. ABOVE $30000      |   35%    |       OSHOFREE35
    
__________________________________________________________
    
    """
    );
    String discount = "";
    
    System.out.println("Enter the cart total: ");
    int cartTotal = input.nextInt();
    
    if(cartTotal >= 5000)
        System.out.print("Enter the Promo code IN UPPERCASE: ");
        String promoCode = input.next();
        
    double price = OshoFreePromoEngine.getDiscount(cartTotal, promoCode);
    
    if(promoCode.equalsIgnoreCase("starter10")){
    discount = "10%";
  }
    else if(promoCode.equalsIgnoreCase("bigboy20")){
    discount = "20%";
    }
    
    else if(promoCode.equalsIgnoreCase("oshofree35")){
    discount = "35%";
    }
    
    System.out.print("Enter the amount you paid: ");
    int amount = input.nextInt();
    
    double change = amount - price; 
    
    System.out.printf("""
    
--------------- RECEIPT ---------------

 CART-TOTAL = %d
 
 DISCOUNT = %s
 
 CHANGE = %.1f
 
    
    
    
    """
    , cartTotal, discount, change);
    }
}
