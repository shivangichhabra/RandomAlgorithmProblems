import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Shivangi on 5/27/2017.
 */
public class HuffmanEncoding {

    static class Node implements Comparable<Node>{
        double probability;
        String name;
        Node left,right;

        Node(double p, String n){
            this.probability = p;
            this.name = n;
        }

        @Override
        public int compareTo(Node o) {
            return (int)Math.round(this.probability = o.probability)*100;
        }
    }


    public static void huffmanDFS(Node n, String value){
        if(n.left == null && n.right == null){
            System.out.println(n.name + "-->" + value);
            return;
        }

        huffmanDFS(n.left, value+"0");
        huffmanDFS(n.right, value+"1");
    }

    public static void main(String args[]){
        ArrayList<Node> array = new ArrayList<>();
        double input[] = {0.1, 0.2, 0.3, 0.4};
        String values[] = {"a", "b", "c", "d"};

        for(int i=0; i<input.length; i++){
            Node n = new Node(input[i], values[i]);
            array.add(n);
        }

        while (array.size() > 1){
            Collections.sort(array);

            Node first = array.get(0);
            array.remove(0);

            Node second = array.get(0);
            array.remove(0);

            Node combined = new Node(first.probability +  second.probability, "");

            combined.left = first;
            combined.right = second;

            array.add(combined);
        }
        huffmanDFS(array.get(0), "");
    }
}
