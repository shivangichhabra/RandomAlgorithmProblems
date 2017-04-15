/**
 * Created by Shivangi on 4/6/2017.
 */
public class ZeroMatrix {

    public void setZeros(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int k=0; k<row.length; k++){
            if(row[k])
                nullifyRow(matrix, k);
        }

        for(int k=0; k<column.length; k++){
            if(column[k])
                nullifyColumn(matrix, k);
        }
    }

    public void nullifyRow(int[][] matrix, int row){
        for(int i=0; i<matrix[0].length; i++)
            matrix[row][i] = 0;
    }

    public void nullifyColumn(int[][] matrix, int column){
        for(int i=0; i<matrix.length; i++)
            matrix[i][column] = 0;
    }

    public void display(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        ZeroMatrix zm = new ZeroMatrix();
        int[][] matrix = {{1,2,5,7,0,},{2,4,6,8,7},{8,7,7,1,4},{0,1,2,4,5,7}};
        zm.display(matrix);

        System.out.println("\nZero Matrix:\n");
        zm.setZeros(matrix);
        zm.display(matrix);
    }
}
