package CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        getResult(result,new ArrayList<Integer>(),candidates,target,0);
        return result;
    }

    private void getResult(List<List<Integer>> result, ArrayList<Integer> cur, int[] candidates, int target,int pos) {
        if (target > 0) {
            for (int i = pos; i < candidates.length && target >= candidates[i]; i++) {
                if(i > pos && candidates[i]==candidates[i-1]){
                    continue;
                }
                cur.add(candidates[i]);
                getResult(result, cur, candidates, target - candidates[i], i + 1);
                cur.remove(cur.size() - 1);
            }
        }
        if (target == 0) {
            result.add(cur);
        }
    }
}
