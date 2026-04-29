public class largestnumber{
    public static void main(String... args){
    System.out.println("largest = " + getlargest(new int []{-12, -45, -24, -3, 82, 28, 287}));
    System.out.println(getreverse(new int[]{1, 34, 23, 23, 11}));
}
    public static int getreverse(int [] numbers){
    for(int num = numbers.length - 1; num >= 0; num--){
    System.out.print(numbers[num] + " ");
}    
    return numbers[0
    ];
}

    public static int getlargest(int [] numbers){
    int largest = numbers[0];

    for(int num = 1; num < numbers.length; num++){
    if (numbers[num] > largest){
    largest = numbers[num];
    }
}
return largest;
}
}
