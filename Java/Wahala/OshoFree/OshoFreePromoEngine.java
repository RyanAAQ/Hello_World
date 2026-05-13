public class OshoFreePromoEngine{
    public static double getDiscount(int cartTotal, String promoCode){

    double discount = 0.0;
    
    if((cartTotal >= 5000) && (cartTotal < 15000) && (promoCode.equalsIgnoreCase("STARTER10"))){
        discount = 0.10;
        
    } 
    else if((cartTotal >= 15000) && (cartTotal < 30000) && (promoCode.equalsIgnoreCase("BIGBOY20"))){
        discount = 0.20;
        
    }
    else if((cartTotal >= 30000) && (promoCode.equalsIgnoreCase("OSHOFREE35"))){
        discount = 0.35;
        
    }
    return cartTotal - (cartTotal * discount);
}
}
