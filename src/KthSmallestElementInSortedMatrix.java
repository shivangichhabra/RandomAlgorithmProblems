/**
 * Created by Shivangi on 6/27/2017.
 */
public class KthSmallestElementInSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        int start = matrix[0][0];
        int end = matrix[matrix.length-1][matrix.length-1];

        while(start < end){
            int mid = (start+end)/2;
            int count = getCount(matrix, mid);
            if(count < k)
                start = mid+1;
            else
                end = mid;
        }
        return end;
    }


    public int getCount(int[][] matrix, int mid){
        int m = matrix.length;
        int i = m-1;
        int j = 0;
        int count = 0;

        while(i>=0 && j<m){
            if(matrix[i][j] <= mid){
                count += i+1;
                j++;
            } else{
                i--;
            }
        }
        return count;
    }

    public static void main(String args[]){
        KthSmallestElementInSortedMatrix k = new KthSmallestElementInSortedMatrix();
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int result = k.kthSmallest(matrix, 13);

        System.out.println(result);
    }
}
