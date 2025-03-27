//Question 4)
//Create a two dimensional array of integers and display: 1. sum of all elements of each
//column 2. sum of all elements of each row.


public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        System.out.println("Sum of each column:");
        for(int j = 0; j < matrix[0].length; j++) {
            int columnSum = 0;
            for(int i = 0; i < matrix.length; i++) {
                columnSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + columnSum);
        }

        System.out.println("\nSum of each row:");
        for(int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for(int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }
    }
}

