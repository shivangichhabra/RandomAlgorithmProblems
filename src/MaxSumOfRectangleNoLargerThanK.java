import java.util.TreeSet;

/**
 * Created by keepi on 6/27/2017.
 */
public class MaxSumOfRectangleNoLargerThanK {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return 0;

        int row=matrix.length;
        int col=matrix[0].length;

        int m = Math.max(row, col);
        int n = Math.min(row, col);
        boolean isRowLarger = false;
        if(row>col)
            isRowLarger=true;

        int result = Integer.MIN_VALUE;

        for(int c1=0; c1<n; c1++){

            int[] each = new int[m];
            for(int c2=c1; c2>=0; c2--){

                for(int r=0; r<m; r++){
                    each[r]+=isRowLarger?matrix[r][c2]:matrix[c2][r];
                }

                result = Math.max(result, getLargestSumCloseToK(each, k));
            }
        }

        return result;
    }

    public int getLargestSumCloseToK(int[] arr, int k){
        int sum=0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        int result=Integer.MIN_VALUE;
        set.add(0);

        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];

            Integer ceiling = set.ceiling(sum-k);
            if(ceiling!=null){
                result = Math.max(result, sum-ceiling);
            }

            set.add(sum);
        }

        return result;
    }
}
