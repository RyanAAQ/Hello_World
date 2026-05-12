public class MaximumNumber{
    public static int max(int a, int b, int c){
    int largest = a;
    
    if(b > largest)
    largest = b;
    
    if(c > largest)
    largest = c;
    
    return largest;
    }       
}
