import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shivangi on 4/16/2017.
 */
public class PascalTriangle {

    public List<List<Integer>> printTriangle(int numOfRows){
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> row, num = null;
        for(int i=0; i<numOfRows; i++){
            row = new ArrayList<>();
            for(int j=0; j<= i; j++){
                if(j==0 || j==1)
                    row.add(1);
                else
                    row.add(num.get(j-1)+ num.get(j));
                num = row;
                triangle.add(row);
            }
        }
        return triangle;
    }

    public List<Integer> printRow(int n){
        List<Integer> row = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<=n; i++){
            row.add(1);
            for(int j=i-1; j>0; j--){
                row.set(j, row.get(j-1)+row.get(j));
            }
        }
        return row;
    }

    public static void main(String args[]){
        PascalTriangle pt = new PascalTriangle();
        int n = 4;

        List<Integer> l = pt.printRow(n);

        for(int i=0; i<l.size(); i++)
            System.out.print(l.get(i) + " ");
    }
}
