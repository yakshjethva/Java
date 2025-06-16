package HackerRank;

public class Tetris{

    public static int solution(int[][] field, int[][] figure) {
        int fieldHeight = field.length;
        int fieldWidth = field[0].length;
        int figHeight = figure.length;
        int figWidth = figure[0].length;

        // Slide the figure over all valid top-left positions in the field
        for (int row = 0; row <= fieldHeight - figHeight; row++) {
            for (int col = 0; col <= fieldWidth - figWidth; col++) {
                if (canPlace(figure, field, row, col)) {
                    return col; // return only column index of top-left match
                }
            }
        }

        return -1;
    }

    // Check if figure can be placed at (startRow, startCol)
    private static boolean canPlace(int[][] figure, int[][] field, int startRow, int startCol) {
        int figHeight = figure.length;
        int figWidth = figure[0].length;

        for (int i = 0; i < figHeight; i++) {
            for (int j = 0; j < figWidth; j++) {
                if (figure[i][j] == 1 && field[startRow + i][startCol + j] == 1) {
                    return false; // Overlapping 1s
                }
            }
        }
        return true;
    }

    // Sample test
    public static void main(String[] args) {
        int[][] field = {
            {0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0}
        };

        int[][] figure = {
            {1, 0},
            {1, 1}
        };

        int result = solution(field, figure);
        System.out.println("First valid column index: " + result);
    }
}
