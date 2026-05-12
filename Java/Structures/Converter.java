public class Converter{
    public static void main(String... args){
    
    System.out.println("2 miles = " + mileToKilometer(2) + " kilometers");
    System.out.print("2 kilometers = " + kilometerToMile(2) + " miles");

    System.out.println("\nMiles to Kilometers");
    System.out.println("Miles    Kilometers");
    for(int mile = 1; mile <= 10; mile++){
    System.out.printf("%-9d %.3f%n", mile, mileToKilometer(mile));
}
    System.out.println("\nKilometers to Miles");
    System.out.println("KIlometers    Miles");
    for(int kilometer = 1; kilometer <= 10; kilometer++){
    System.out.printf("%-13d %.3f%n", kilometer, kilometerToMile(kilometer));
    }
}
    public static double mileToKilometer(double mile){
    return mile * 1.609;
    }
    
    public static double kilometerToMile(double kilometer){
    return kilometer / 1.609;
    }
}
