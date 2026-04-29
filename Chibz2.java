
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

 for(int row2 = 0; row2 < scores.length; row2++){
       for(int column2 = 0; column2 < scores[0].length; column2++){
    if(scores[row2][column2] == 'X')
    System.out.print(1 + " ");
    
    else
    System.out.print(0 + " ");
}

    System.out.println();
    }
}
}

