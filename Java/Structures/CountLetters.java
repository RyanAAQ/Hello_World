import java.util.Scanner;

public class CountLetters{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter any word: ");
    String word = input.nextLine();
    
    System.out.print("The word " + word + " has " + countLetters(word) + " letters");
    }
    public static int countLetters(String s){
    int count = 0;
    
    for(int i = 0; i < s.length(); i++){
    char letter = s.charAt(i);
    
    if((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
    count++;
    }
   } 
    return count;
    }
}
