package Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<Integer>(),nums,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer>cur,int[] nums,int pos){
        if(nums.length == cur.size()){
            result.add(new ArrayList<>(cur));
        }
        for(int i = 0; i < cur.size();i++){
            List<Integer> newCur = new ArrayList<>();
            newCur.add(i,nums[pos]);
            backtrack(result,newCur,nums,pos+1);
        }
    }
}
