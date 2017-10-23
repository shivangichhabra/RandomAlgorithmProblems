import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        getSubsets(list, "", n, n);
        return list;
    }
    
    private void getSubsets(List<String> list, String subset, int start, int end){
        if(start > end)
            return;
            
        if(start > 0)
            getSubsets(list, subset+"(", start-1, end);
        if(end > 0)
            getSubsets(list, subset+")", start, end-1);
        
        if(start == 0 && end == 0)
            list.add(subset);
            return;
    }

    public void genParanthesis(int n){
        String subset = "";
        while(n>0){
            subset += "()";
            n--;
        }

        System.out.println(subset);
    }

    public static void main(String args[]){
        GenerateParenthesis g = new GenerateParenthesis();
        List<String> list = g.generateParenthesis(3);
        for(String s: list){
            System.out.println(s);
        }

        g.genParanthesis(10);
    }
}
