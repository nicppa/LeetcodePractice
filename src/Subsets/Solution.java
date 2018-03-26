package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result,new ArrayList<>(),nums,0);
        return result;
    }
    public void backTrack(List<List<Integer>> result,List<Integer> cur,int[] nums,int start){
        result.add(new ArrayList<>(cur));
        for(int i = start; i < nums.length;i++){
            cur.add(nums[i]);
            backTrack(result,cur,nums,i+1);
            cur.remove(cur.size()-1);
        }
    }
}
