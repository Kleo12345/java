import java.util.Arrays;

public class MatrixWork {
    public static void fillDiagonal(int[][] matrix){
        Arrays.fill(matrix[0],0,1,3);
        Arrays.fill(matrix[1],1,2,5);
        Arrays.fill(matrix[2],2,3,6);
    }
    public static int[][] extractColumn(int i , int j){
        int[][] matrix= new int[][]{{1,3,5},{5,6,8},{4,7,2}};
        int[] a = new int[matrix.length];
        for (int k = 0;k< matrix.length;k++){
            a[k] = matrix[i][j];
            i += 1;
            j += 1;
        }
        Arrays.sort(a);
        i=0;
        j=0;
        for (int k=0; k< matrix.length;k++){
            matrix[i][j]=a[k];
            i++;
            j++;
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        int i=0;
        int k=0;
        int j= 0;
        int[]a = new int[matrix.length];
        System.out.println("The matrix: ");
        while (i< matrix.length){
            while(j< matrix.length){
                a[k]=matrix[i][j];
                j++;
                k++;
            }
            System.out.println(Arrays.toString(a));
            j=0;
            k=0;
            i++;
        }
    }
    public static void calculateDeterminante(int[][] matrix){
        int determinante=0;
        if(matrix.length == 1){
            determinante = matrix[0][0];
            System.out.println("The determinante of the matrix is: ");
            System.out.println(determinante);
        } else if (matrix.length==2) {
            determinante= (matrix[0][0] * matrix[1][1])-(matrix[0][1]*matrix[1][0]);
            System.out.println("The determinante of the matrix is: ");
            System.out.println(determinante);
        } else{
            System.out.println("Error!");
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        System.out.println(Arrays.deepToString(matrix));
        fillDiagonal(matrix);
        int[][] matrix2= extractColumn(0,0);
        int[][] matrix3 = new int[][]{{2,4,3},{5,7,6},{9,8,1}};
        System.out.println(Arrays.deepToString(matrix2));
        printMatrix(matrix3);
        int[][] matrix4 = new int[][]{{2,4,3},{5,7,6}};
        calculateDeterminante(matrix4);
    }
}