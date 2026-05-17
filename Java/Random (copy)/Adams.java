public class Adams{
    public static void main(String... args){
    
    }
    public static int largest(int [] numbers){
    int largest = numbers[0];
    
    for(int count = 0; count < numbers.length; count++){
    
    if(numbers[count] > largest)
    largest = numbers[count];
    
    return largest;
    }
    
    }
}
