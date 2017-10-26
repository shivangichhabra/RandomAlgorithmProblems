/**
 * Created by Shivangi on 6/27/2017.
 */
public class SearchIn2DMatrix {

    /*
     An algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

        Integers in each row are sorted from left to right.
        The first integer of each row is greater than the last integer of the previous row.

      Done with Binary Search
     */
    public boolean searchMatrixOne(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m*n-1;

        while(start <= end){
            int mid  = (start+end)/2;
            int x = mid/n;
            int y = mid%n;

            if(matrix[x][y] < target)
                start =  mid+1;
            else if(matrix[x][y] > target)
                end = mid-1;
            else
                return true;
        }
        return false;
    }

    /*
    An algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

        Integers in each row are sorted in ascending from left to right.
        Integers in each column are sorted in ascending from top to bottom.
     */
    public boolean searchMatrixTwo(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int m = matrix.length-1;
        int n = matrix[0].length-1;

        //start from bottom left corner
        int start = m;
        int end = 0;

        while(start >= 0 && end <= n){
            if(matrix[start][end] > target)
                start--; //go to upper row
            else if(matrix[start][end] < target)
                end++; //go to next column
            else
                return true;
        }
        return false;
    }

    public static void main(String args[]){

        SearchIn2DMatrix md = new SearchIn2DMatrix();
        int[][] matrix1 = {{1,   3,  5,  7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println( md.searchMatrixOne(matrix1, 11));

        int[][] matrix2 = {{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        System.out.println(md.searchMatrixTwo(matrix2,9 ));
    }
}
