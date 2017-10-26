/**
 * Created by Shivangi on 6/24/2017.
 */
public class ReshapeMatrix {

    /*
    O(n^2)
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if(r*c != n*m)
            return nums;

        int[][] output = new int[r][c];
        int row =0, col = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                output[row][col] = nums[i][j];
                col++;
                if(col == c){
                    row++;
                    col=0;
                }
            }
        }
        return output;
    }

    /*
    O(n)
     */
    public int[][] reshape(int[][] nums, int r, int c){
        int n = nums.length, m = nums[0].length;
        if(r*c != n*m)
            return nums;

        int[][] output = new int[r][c];
        for(int i=0; i < r*c; i++)
            output[i/c][i%c] = nums[i/m][i%m];

        return output;
    }

    public static void main(String args[]){
        ReshapeMatrix rm = new ReshapeMatrix();
        int[][] matrix = {{1,2,3},{4,5,6}};

        int[][] output = rm.reshape(matrix, 3, 2);

        for(int i=0; i<output.length; i++){
            for(int j=0; j<output[0].length; j++){
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
