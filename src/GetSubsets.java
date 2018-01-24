import java.util.ArrayList;
import java.util.List;

public class GetSubsets {

    public static ArrayList<ArrayList<Integer>> getSubsets(List<Integer> set) {
        if (set == null) return null;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (set.isEmpty()) {
            result.add(new ArrayList<Integer>());
            return result;
        }
        ArrayList<ArrayList<Integer>> lastSubsets = getSubsets(set.subList(1, set.size()));
        result.addAll(lastSubsets);
        for (ArrayList<Integer> lastSubset : lastSubsets) {
            ArrayList<Integer> subset = new ArrayList<Integer>(lastSubset);
            subset.add(set.get(0));
            result.add(subset);
        }
        return result;
    }

    /*
     * Better recursion: backtracking
     */
    public static List<List<Integer>> getSubsetsBacktrack(List<Integer> set) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getSubsetsBacktrack(set, 0, result, new ArrayList<Integer>());
        return result;
    }

    private static void getSubsetsBacktrack(List<Integer> input, int index, List<List<Integer>> result, List<Integer> subset) {
        result.add(new ArrayList<Integer>(subset));
        for (int i = index; i < input.size(); ++i) {
            subset.add(input.get(i));
            getSubsetsBacktrack(input, i + 1, result, subset);
            subset.remove(subset.size() - 1);
        }
    }
}
