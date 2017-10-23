import java.io.IOException;
import java.util.*;

/**
 * Sample Input:
 * cat act tac bat tab teaching silent listen cheating tab dog god damm Mad take kate dog act god act care dog
 *
 * Sample Output:
 * act cat tac
 * bat tab
 * cheating teaching
 * dog god
 * kate take
 * listen silent
 */
public class FriendlyWords {

    /*
    Things to check
    1. All string with same characters printed together in one line
    2. Avoid repetition
    3. Print in sorted order
     */
    public static String[] findFriendlyWords(String[] input){
        boolean usedInput[] = new boolean[input.length];
        String sortedInput[] = new String[input.length];
        List<String> output = new ArrayList<String>();

        //sort the input
        for(int i=0; i<input.length; i++){
            char[] chars = input[i].toCharArray();
            Arrays.sort(chars);
            sortedInput[i] = new String(chars);
        }

        for(int i=0; i<input.length; i++){
            //check if element is repeated
            if(usedInput[i] == false) {
                List<String> line = new ArrayList<String>();
                for (int j = i + 1; j < input.length; j++) {
                    //check for matching chars
                    if (sortedInput[i].equals(sortedInput[j])) {
                        usedInput[j] = true;
                        if(!line.contains(input[j]) && !input[i].equals(input[j])) {
                            line.add(input[j]);
                        }
                    }
                }

                if(line.size() > 0) {
                    line.add(input[i]);
                    //check if line is sorted
                    line.sort(new Comparator<String>() {
                        @Override
                        public int compare(String s1, String s2) {
                            return s1.compareToIgnoreCase(s2);
                        }
                    });

                    StringBuilder outString = new StringBuilder();
                    for (String word : line) {
                        outString.append(word + " ");
                    }
                    output.add(outString.toString());
                }
            }
        }

        //check if output is sorted
        output.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });

        return output.toArray(new String[output.size()]);
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] a = null;

        try {
            a = in.nextLine().split(" ");
        } catch (Exception e) {

        }

        try {
            for (String words : findFriendlyWords(a)) {
                System.out.println(words);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
