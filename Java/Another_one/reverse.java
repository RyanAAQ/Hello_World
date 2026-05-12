public class reverse{
    public static void main(String... args){
    System.out.print(getreverse(new int[]{1, 34, 56, 4, 2, 1,}));
}
    public static int getreverse(int [] numbers){
    for(int num = numbers.length - 1; num >= 0; num--){
    System.out.print(numbers[num] + " ");
    
}
    return numbers[0];
}
}
