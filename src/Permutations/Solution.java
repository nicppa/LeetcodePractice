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
        }else{
            for(int i = pos; i < nums.length;i++){
                if(cur.contains(nums[pos])){
                    continue;
                }
                cur.add(nums[pos]);
                backtrack(result,cur,nums,pos+1);
                cur.remove(cur.size()-1);
            }
        }


    }
}
