public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Traverse the matrix starting from row 1 and column 1
        for (int i = 1; i < rows; i++) {

            for (int j = 1; j < cols; j++) {

                // Compare current element with its upper-left element
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 1, 2, 3},
            {9, 5, 1, 2}
        };

        boolean result = isToeplitzMatrix(matrix);

        System.out.println("Is the matrix Toeplitz? " + result);
    }
}