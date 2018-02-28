package PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(result,new ArrayList<Integer>(),nums,used);
        return result;
    }

    private void backtrack(List<List<Integer>> result,List<Integer> cur,int[] nums,boolean[] used){
        if(cur.size() == nums.length){
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]) continue;
            if( i>0 && nums[i-1]==nums[i] && !nums[i-1]) continue;
            used[i] = true;
            cur.add(nums[i]);
            backtrack(result,cur,nums,used);
            used[i]=false;
            cur.remove(cur.size()-1);
        }
    }
}
