public class PentagonalNumbers{
    public static void main(String... args){
      for(int count = 1; count <= 100; count++){
    System.out.printf("%7d", PentagonalNumbers.getPentagonalNumber(count));
       if(count % 10 == 0)
    System.out.println();
}
}    
    public static int getPentagonalNumber(int n){
    return n * (3 * n - 1) / 2;
    }
}


