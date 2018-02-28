package Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result,new ArrayList<Integer>(),nums,0);
        return result;
    }

    private void backtrack(List<List<Integer>> result,List<Integer> cur,int[] nums,int pos){
        if(cur.size() == nums.length){
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i <= cur.size(); i++) {
            List<Integer> newCur = new ArrayList<>(cur);
            newCur.add(i, nums[pos]);
            backtrack(result, newCur, nums, pos+1);
        }
    }
}
