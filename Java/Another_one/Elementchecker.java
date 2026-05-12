public class Elementchecker{
    public static void main(String... args){
    System.out.print(getelement(new int[]{-12, -45, -24, -3, 82, 28, 287}));
}    
    public static int getelement(int [] numbers){

    for(int num = 0; num < numbers.length; num++){
    if (numbers[num] == -3){
    return -3;
    }else {
    return 0;
    }

}
}
