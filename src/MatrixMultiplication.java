public class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] a ={
                {12,24},
                {23,44},
                {54,66}
        };

        int[][] b ={
                {12,24,33},
                {23,44,56}
        };

        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        int[][] c = new int[rowsA][colsB];

        for(int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}