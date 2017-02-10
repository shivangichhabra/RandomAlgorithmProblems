import java.util.*;

/**
 * You are given a phone book that consists of people's names and their phone number.
 * After that you will be given some person's name as query. For each query, print the
 * phone number of that person.
 *
 * Sample Input:
 *  3
 *  uncle sam
 *  99912222
 *  tom
 *  11122222
 *  harry
 *  12299933
 *  uncle sam
 *  uncle tom
 *  harry
 *
 * Sample Output:
 *  uncle sam=99912222
 *  Not found
 *  harry=12299933
 */
public class Maptask {

    public static void main(String []argh) {
        HashMap<String, Integer> map =new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            } else {
                System.out.println("Not found");
            }

        }
    }
}
