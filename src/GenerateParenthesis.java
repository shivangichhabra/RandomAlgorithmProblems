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
}
