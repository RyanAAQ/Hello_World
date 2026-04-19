public class PrimeNumbers{
    public static void main(String[] args){

    int count = 0;
    int num = 0;
    for(num = 2; num <= 1200; num++){
    

    int d = 0;

    for(int i = 2; i < num; i++){
    if ( num % i == 0) {
d++;
}
    }

    if ( d == 0){
     System.out.print(num + " ");
    count++;

    if (count % 8 == 0){
    System.out.println("");
}
    }
}
    }
}
