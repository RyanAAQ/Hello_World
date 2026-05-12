public class Two{
    public static void main(String... args){
    
    String words = "eggroll";
    System.out.print(words +" reversed = " + reverse(words));
    }
    public static String reverse(String word){
    String characters = "";
    for(int words = word.length() - 1; words >= 0; words--){
    characters = characters + word.charAt(words);
    }
    return characters;
    }
}
