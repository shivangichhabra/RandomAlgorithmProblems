import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Shivangi on 3/27/2017.
 */
public class FindWords {

    public static String[] findWords(String[] words) {

        Set<Character> one = new HashSet<>();
        one.add('q');
        one.add('w');
        one.add('e');
        one.add('r');
        one.add('t');
        one.add('y');
        one.add('u');
        one.add('i');
        one.add('o');
        one.add('p');

        Set<Character> two = new HashSet<>();
        two.add('a');
        two.add('s');
        two.add('d');
        two.add('f');
        two.add('g');
        two.add('h');
        two.add('j');
        two.add('k');
        two.add('l');

        Set<Character> three = new HashSet<>();
        three.add('z');
        three.add('x');
        three.add('c');
        three.add('v');
        three.add('b');
        three.add('n');
        three.add('m');

        List<String> list = new ArrayList<>();

        for(String word : words){
            char[] s = word.toLowerCase().toCharArray();
            int count = 0;
            int len = s.length;

            for(int i=0; i<len; i++){
                if(one.contains(s[i]))
                    count++;
            }
            if(count == len)
                list.add(word);

            count = 0;

            for(int i=0; i<len; i++){
                if(two.contains(s[i]))
                    count++;
            }
            if(count == len)
                list.add(word);

            count = 0;

            for(int i=0; i<len; i++){
                if(three.contains(s[i]))
                    count++;
            }
            if(count == len)
                list.add(word);
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String args[]){
        FindWords fw = new FindWords();

        String[] input = {"qaz","wsx","edc","rfv","tgb","yhn","ujm","ik","pklo","ppppppp"};
        String[] output = findWords(input);
        for(String o : output){
            System.out.println(o);
        }

    }
}
