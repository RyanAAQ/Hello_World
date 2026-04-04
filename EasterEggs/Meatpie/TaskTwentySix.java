import java.util.Scanner;
    
    public class TaskTwentySix{
        public static void main(String[] args){
   
    Scanner input = new Scanner(System.in);
    
    System.out.println("Whats your name");
    String name = input.nextLine();

    System.out.println("How old are you");
    int age = input.nextInt();

    System.out.printf("My name is %s and i am %d years old", name, age);

    }
}
    
