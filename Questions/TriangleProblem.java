package Questions;

public class TriangleProblem {
    public static void main(String[] args) {
        int[][] triangle = {
            {2, 9, 8, 3,1},
            {3, 4},
            {6, 5, 7},
            {4, 1, 8, 3}
        };

        int sumOfMinimums = 0;

        for (int[] row : triangle) {
            int rowMin = Integer.MAX_VALUE; 
            for (int num : row) {
                if (num < rowMin) {
                    rowMin = num;
                }
            }
            sumOfMinimums += rowMin; 
        }

        System.out.println("Sum of minimum values from each row: " + sumOfMinimums);
    }
}

