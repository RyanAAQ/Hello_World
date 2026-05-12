public class EvenandOdd{
    public static void main(String... args){
    System.out.print(getEvenandOdd(new int []{-12, -45, -24, -3, 82, 28, 287}));
}    
    public static int getEvenandOdd(int [] numbers){

    for(int num = 1; num < numbers.length; num++){
    if (numbers[num] % 2 != 0)
    System.out.print(" even = " + numbers[num]);
    
    else
    System.out.print("odd = " + numbers[num]);

}
return 0;
}
}
