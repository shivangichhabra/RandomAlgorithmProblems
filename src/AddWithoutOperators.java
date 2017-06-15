/**
 * Created by FS047207 on 6/15/2017.
 */
public class AddWithoutOperators {

    public int add(int a, int b){

        //while carry is not 0
        while(b != 0){
            // carry now contains common set bits of x and y
            int carry  = a&b;

            // Sum of bits of x and y where at least one of the bits is not set
            a = a^b;

            // Carry is shifted by one so that adding it to x gives the required sum
            b = carry <<1;
        }

        return a;
    }

    public static void main(String args[]){
        AddWithoutOperators a = new AddWithoutOperators();
        System.out.println(a.add(15,32));
        System.out.println(a.add(5,7));
        System.out.println(a.add(5,-2));
    }
}
