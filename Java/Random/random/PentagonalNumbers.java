public class PentagonalNumbers{
    public static void main(String... args){
    for(count = 0; count <= 100; count++){
    System.out.printf("%7d", getPentagonalnumber(count));
    }
    if(count % 10 == 0)
    System.out.println();
}       
    public static int getPentagonalNumber(int n){
    return n * (3 * n - 1) / 2;
    
    
    
    }
    
    
}
