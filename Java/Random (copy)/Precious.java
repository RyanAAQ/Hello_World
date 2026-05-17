public class Precious{
    public static void main(String... args) {
        int[][][] grid = {
    { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} },
    { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
    { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} }
        };

    for (int i = grid.length - 1; i >= 0; i--) {
    System.out.println("Layer " + i + ":");
    for (int j = grid[i].length - 1; j >= 0; j--) {
    for (int k = grid[i][j].length - 1; k >= 0; k--) {
    System.out.print(grid[i][j][k] + " ");
}
    System.out.println();
            }
        }
    }
}

