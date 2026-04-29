public class Chibz{
    public static void main(String... args){
 
    char[][] scores = new char[3][3];

    scores[0][0] = 'X';
    scores[0][1] = 'O';
    scores[0][2] = 'X';
    scores[1][0] = 'O';
    scores[1][1] = 'O';
    scores[1][2] = 'O';
    scores[2][0] = 'X';
    scores[2][1] = 'X';
    scores[2][2] = 'O';

    for(int row = 0; row < scores.length; row++){
       for(int column = 0; column < scores[0].length; column++){
    System.out.print(scores[row][column] + " ");

}
    System.out.println();
}
   
   }
}
