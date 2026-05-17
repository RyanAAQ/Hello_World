public class Arrays{
    public static void main(String... args){

    int[] array = { 10, 28, 282, 22, 27, 27, 21, 29, 20, 2};
    int total = 0;

    for(int counter = 0; counter < array.length; counter++){
    total += array[counter];
    }

    System.out.println("Total = " + total);

}
}
