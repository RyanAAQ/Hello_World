import java.util.Scanner;

public class Part1{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a word: ");
    String nigger = input.next();
    
    System.out.print(length(nigger));
}
    public static int length(String word){
    int count = 0;
    for(char letters : word){
    count++;
    }
    return count;
    }
}
