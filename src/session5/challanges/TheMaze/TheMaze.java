package session5.challanges.TheMaze;

public class TheMaze {
    public static void main(String[] args) {
        char[][] theMaze = {
                {'1', '1', '0', '1'},
                {'E', '0', '0', '1'},
                {'1', '1', '0', '1'},
                {'1', '1', 'S', '1'}
        };
        print2D(theMaze);
        startFinding(theMaze);

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
        for (int row2 = 0; row2 < theMaze.length; row2++) {
            for (int column2 = 0; column2 < theMaze.length; column2++) {
                char start = 'S';
                if (start == theMaze[row2][column2]) {
                    System.out.println("The maze START has[" + row2 + "]" + "[" + column2 + "] coords.");

                }
            }
        }
    }


}
