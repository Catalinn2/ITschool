package session5.challanges.TheMaze;

public class TheMaze {
    public static void main(String[] args) {
        char[][] theMaze = {{'1', '1', '0', '1'}, {'S', '0', '0', '1'}, {'1', '1', '0', '1'}, {'1', '1', 'E', '1'}};
        print2D(theMaze);
        startFinding(theMaze);
        int startRow = 0;
        int startCol = 1;
        if (startRow>=0 && startRow< theMaze.length && startCol >= 0 && startCol< theMaze.length){
            if (theMaze[startRow+1][startCol] == '0')
        }

    }


    private static void print2D(char[][] theMaze) {
        for (int row = 0; row < theMaze.length; row++) {
            for (int column = 0; column < theMaze.length; column++) {
                System.out.print(theMaze[row][column] + "  ");
            }
            System.out.println("  ");
        }
    }

    public static void startFinding(char[][] theMaze) {
        for (int row = 0; row < theMaze.length; row++) {
            for (int column = 0; column < theMaze.length; column++) {
                char start = 'S';
                if (start == theMaze[row][column]) {
                    System.out.println("The maze START has[" + row + "]" + "[" + column + "] coords.");
                    int startRow = row, startColumn = column;
                }
            }
        }
    }


}
