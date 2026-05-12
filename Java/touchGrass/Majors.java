import java.util.Scanner;

public class Major{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a letter between I, C and A");
    char letter = input.next().charAt(0);

    System.out.println("Enter the year");
    int year = input.nextInt();

    String majorname = "";

    if (letter = "I" || letter == "i"){
    majorname = "Information Management";   

   } else if (letter == "C" || letter == "c"){
    majorname = "Comuter Science";

   } else if (letter == "A" || letter == "a"){
    majorname = "Accounting";

  } else {
    majorname = "Invalid";
}

    String years = "";

    if (year == 1){
    years = "Freshman";

   } else if (year == 2) {
    years = "Sophomore";

   } else if (year == 3){
    years = "Junior";

   } else if (year == 4){
    years = "Senior";
   
   } else{ 
    years = "Invalid";
}

    System.out.println("Major: " + majorname);
    System.out.println("Year: " + years);
    }
}
