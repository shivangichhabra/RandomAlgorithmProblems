import java.util.Scanner;

/**
 * Created by Shivangi on 1/1/2017.
 */
public class RotateSquareMatrix {

    public int[][] input(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int size = sc.nextInt();
        int a[][] = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                a[i][j] = count++;
            }
        }
        return a;
    }

    public void display(int array[][]){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public void transpose(int array[][]){
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array[0].length; j++){
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    public void swapRows(int array[][]){
        for(int i=0, k= array.length-1; i<k; i++, k--){
            int[] temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
    }

    /*
    Right side
     */
    public void rotateClockwise(int array[][]){
        swapRows(array);
        transpose(array);
    }

    /*
    Left side
     */
    public void rotateAntiClockwise(int array[][]){
        transpose(array);
        swapRows(array);
    }


    public static void main(String args[]){
        RotateSquareMatrix rm = new RotateSquareMatrix();
        int array1[][] = rm.input();
        rm.display(array1);

        System.out.println("\nRotate clockwise");
        rm.rotateClockwise(array1);
        rm.display(array1);

        int array2[][] = rm.input();
        rm.display(array2);

        System.out.println("\nRotate anti-cloclwise");
        rm.rotateAntiClockwise(array2);
        rm.display(array2);

    }
}
