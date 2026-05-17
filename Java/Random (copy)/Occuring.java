public class Occuring{
    public static void main(String... args){
    int [] numbers = {1, 2, 2, 2, 3};
    System.out.print("The number of re occuring numbers = " + numberOfTimes(numbers));
    }
    public static int numberOfTimes(int [] numbers){
    int count = 0;
    int [] maxcount = {0};
    int firstNumber = numbers[0];
    
    for(int index : numbers){
    if(firstNumber == index){
    count++;
    
    }else{
    firstNumber = index;
   }
   if(count > maxcount)
   maxcount = public class Occuring {
 
        int[] result = {3}; 
        return result; 
    }
}
count; 
}
    return maxcount;
    }
}
