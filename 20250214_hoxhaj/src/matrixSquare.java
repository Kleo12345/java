import java.util.Arrays;
import java.util.Random;

public class matrixSquare {
    public static void square(int[][] matrix) {
        int sum = 0;
        int sum2= 0;
        //setting the values
        for (int i = 0; i <1; i++){
            for (int k = 0; k < 3; k++) {
                sum = sum + matrix[i][k];
                sum2 = sum2 + matrix[i][k];
            }
        }
        //rows check
        for (int i = 0; i <= matrix.length-1; i++){
            if (sum!=sum2){
                break;
            }else{
                sum2=0;
            }
            for (int j = 0; j <= matrix.length-1; j++){
                sum2 = sum2 +matrix[i][j];
            }
        }
        //main diagonal
        for (int i = 0; i<1; i++){
            if (sum!=sum2){
                break;
            }else{
                sum2=0;
            }
            for (int j = 0; j <= matrix.length-1;j++){
                sum2 = sum2 +matrix[i+1][j];
            }
        }
        //second diagonal
        for (int i =0; i<1;i++){
            if (sum!=sum2){
                break;
            }else{
                sum2=0;
            }
            for (int j =2; j>=0 ; j--)
                sum2 =sum2+matrix[i+1][j];
        }
        //column check
        for (int i= 0;i <=matrix.length-1;i++){

            if (sum!=sum2){
                break;
            }else{
                sum2=0;
            }
            for (int j= 0; j<=matrix.length-1;j++){
                sum2= sum2 + matrix[j][i];
            }
        }
        if (sum==sum2){
            System.out.println("The matrix is a magic square");
            System.out.print("The sum is: ");
            System.out.println(sum);
        }else {
            System.out.println("The matrix is not a magic square");
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Random rand = new Random();
        System.out.println("The matrix: ");
       for (int i = 0; i <= matrix.length-1; i++ ){
            for (int j = 0; j <= matrix.length-1; j++){
                int randomNumber = rand.nextInt(99);
                matrix [i] [j] = randomNumber;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        square(matrix);
    }
}
