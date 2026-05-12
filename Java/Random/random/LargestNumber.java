public class LargestNumber{

    public static void main(String... args){
    int largestnumber = largest(-10, -46, -45);
    System.out.println("The largest number = " + largestnumber);
}
   public static int largest(int firstnumber, int secondnumber, int thirdnumber){
   int largest = 0;

    if (firstnumber > secondnumber && firstnumber > thirdnumber){
    largest = firstnumber;
}
    else if (secondnumber > firstnumber && secondnumber > thirdnumber){
    largest = secondnumber;
}    
    else{
    largest = thirdnumber;
}  
    return largest;
    }
}
