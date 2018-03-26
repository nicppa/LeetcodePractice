package Combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result,new ArrayList<Integer>(),1,n,k);

        return result;
    }
    public void backTrack(List<List<Integer>>result,List<Integer> cur,int start,int n,int k){
        if(k == 0){
            result.add(new ArrayList<>(cur));
            return;
        }
        for(int i = start; i <= n;i++){
            cur.add(i);
            backTrack(result,cur,i+1,n,k-1);
            cur.remove(cur.size()-1);
        }
    }
}
