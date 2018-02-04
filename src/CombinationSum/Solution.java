package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        getResult(result,new ArrayList<Integer>(),candidates,target,0);
        return result;
    }
    public void getResult(List<List<Integer>> result,List<Integer> cur,int[] candidates,int target,int pos){
        if(target > 0){
            for(int i = pos; i < candidates.length && target >= candidates[i];i++){
                cur.add(candidates[i]);
                getResult(result,cur,candidates,target-candidates[i],i);
                cur.remove(cur.size() - 1);
            }
        }else if(target == 0){
            result.add(new ArrayList<Integer>(cur));
        }
    }
}
