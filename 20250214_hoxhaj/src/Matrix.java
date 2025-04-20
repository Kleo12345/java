import java.util.Arrays;

public class Matrix {
    public static void determinante(int[][] matrix) {
        int determinante=0;
        if(matrix.length == 1){
            determinante = matrix[0][0];
            System.out.println("The determinante of the matrix is: ");
            System.out.println(determinante);
        } else if (matrix.length==2) {
            determinante= (matrix[0][0] * matrix[1][1])-(matrix[0][1]*matrix[1][0]);
            System.out.println("The determinante of the matrix is: ");
            System.out.println(determinante);
        } else if (matrix.length==3) {
            determinante = (matrix[0][0]*((matrix[1][1]*matrix[2][2])-(matrix[1][2]*matrix[2][1])))-(matrix[0][1]*((matrix[1][0]*matrix[2][2])-(matrix[1][2]*matrix[2][0]))) +(matrix[0][2]*((matrix[1][0]*matrix[2][1])-(matrix[1][1]*matrix[2][0])));
            System.out.println("The determinante of the matrix is: ");
            System.out.println(determinante);
        }else {
            System.out.println("ERROR!");
            System.out.println("Try passing a matrix with max size 3");
        }
    }
    public static int[][] trasposta(int[][] matrix) {
        var secondMatrix= new int[matrix.length][matrix.length];
        if (matrix.length<4){
            for (int i =0; i< matrix.length; i++){
                for (int j = 0; j <matrix.length; j++){
                    secondMatrix[j][i]= matrix[i][j];
                }
            }
        }else {
            System.out.println("ERROR!");
            System.out.println("Try passing a matrix with max size 3");
        }
        System.out.println("The first matrix");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("The second matrix");
        System.out.println(Arrays.deepToString(secondMatrix));
        return secondMatrix;
    }
    public static int[][] matrixSum(int[][] matrix, int[][]matrix2) {
        int[][] sumMatrix = new int[matrix.length][matrix.length];
        if (matrix.length == matrix2.length){
            for (int i =0; i< matrix.length; i++){
                for (int j = 0; j <matrix.length; j++){
                    sumMatrix[i][j]= matrix[i][j]+matrix2[i][j];
                }
            }
            System.out.println("The sum of the 2 matrices: ");
            System.out.println(Arrays.deepToString(sumMatrix));
        }else {
            System.out.println("Error: Matrices must have the same dimensions to be added.");
        }
        return sumMatrix;
    }
    public static void main(String[] args) {
        int[][] matrix= new int[][] {{0,1,2},{3,4,6},{2,6,8}};
        determinante(matrix);
        int[][] secondMatrix = new int[][] {{0,1,2},{3,4,6},{2,6,8}};
        int[] [] sumMatrixA=matrixSum(matrix,secondMatrix);
        int [][] traspostaA = trasposta(matrix);
        int[][] traspostaB = trasposta(secondMatrix);
        int[][] sumMatrixB = matrixSum(traspostaA,traspostaB);
        if (Arrays.deepEquals(sumMatrixA,sumMatrixB)){
            System.out.println("The matrices sum is equal");
        }else {
            System.out.println("The sum is not equal");
        }
    }
}
