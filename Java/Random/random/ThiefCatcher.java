import java.util.Scanner;

public class ThiefCatcher{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    String shout = "";
    
    while(!shout.equalsIgnoreCase("thief")){
    System.out.println("Catch the thief by saying" + "(thief)");
    shout = input.nextLine().replace(" ", "");
    
    
}
    System.out.print("You have caught the thief");
    
}
}
//    while(shout.equals("thief")){
//    System.out.println("The thief has stolen what he wanted");
//    shout = input.nextLine();
//    
//    if(shout == "thief"){
//    System.out.print("You have caught the thief");
//    break;
//    
//   } else {
//   (shout != "thief")i
//    
   

//Simulates the catching of a thief
//1. Catch the thief
//2. Beat the thief
//3. Feed the thief
//4. Repeat

//program ends wheen the user says thief
