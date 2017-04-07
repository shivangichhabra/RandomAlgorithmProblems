/**
 * Created by Shivangi on 3/28/2017.
 */
public class RemoveAnElement {

    public int removeElement(int[] nums, int val) {
        int x = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val)
                nums[x++] = nums[i];
        }
        return x;
    }

    public static void main(String args[]){
        RemoveAnElement r = new RemoveAnElement();
        int[] a = {3,2,1,3};
        int x = r.removeElement(a,3);

        /*
        Array after in-place removal of all occurences of value x
         */
        for(int i=0; i<x; i++){
            System.out.print(a[i] + "  ");
        }
    }
}
