import java.util.Random;

public class Main {
    static Integer[][] createMatrix() {
        Integer[][] matrix = new Integer[4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j) {
                    matrix[i][j] = random.nextInt(11) + 10;
                } else if (i < j) {
                    matrix[i][j] = random.nextInt(10) + 1;
                } else {
                    matrix[i][j] = 0;
                }


            }

        }

        return matrix;

    }

    static void printMatrix(Integer[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumAboveDiagonal(Integer[][] matrix) {
        int sumAboveDiagonal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < j) {
                    sumAboveDiagonal += matrix[i][j];
                }
            }

        }
        return sumAboveDiagonal;
    }

    static int sumBelowDiagonal(Integer[][] matrix) {
        int sumBelowDiagonal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j) {
                    sumBelowDiagonal += matrix[i][j];
                }
            }

        }
        return sumBelowDiagonal;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Integer[][] matrix = createMatrix();
        printMatrix(matrix);
        System.out.println("Sum above diagonal= " + sumAboveDiagonal(matrix));
        System.out.println("Sum below diagonal= " + sumBelowDiagonal(matrix));
    }
}
