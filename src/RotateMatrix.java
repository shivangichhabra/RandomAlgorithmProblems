/**
 * Created by Shivangi on 4/6/2017.
 */
public class RotateMatrix {

    public void swapRows(int[][] matrix){
        for(int i=0, k= matrix.length-1; i<k; i++, k-- ){
            int[] temp = matrix[i];
            matrix[i] = matrix[k];
            matrix[k] = temp;
        }
    }

    public void tranpose(int[][] matrix){
        for(int i=0; i<matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /*
    <-
     */
    public void rotateLeft(int[][] matrix){
        tranpose(matrix);
        swapRows(matrix);
        displayMatrix(matrix);
    }

    /*
    ->
     */
    public void rotateRight(int[][] matrix){
        swapRows(matrix);
        tranpose(matrix);
        displayMatrix(matrix);
    }

    public int[][] createMatrix(int size){
        int value = 1;
        int[][] matrix = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }

    public void displayMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]){
        RotateMatrix rm = new RotateMatrix();
        int n = 3;
        int[][] matrix = rm.createMatrix(n);
        rm.displayMatrix(matrix);

        System.out.println("\nRotate Right\n");
        rm.rotateRight(matrix);

        System.out.println("\nRotate Left\n");
        rm.rotateLeft(matrix);
    }
}
