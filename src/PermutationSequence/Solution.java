package PermutationSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String getPermutation(int n, int k) {
        int sum = 1;
        int f[] = new int[n+1];
        f[0]=1;
        for(int i =1; i <= n;i++){
            sum *= i;
            f[i] = sum;
        }
        List nums = new ArrayList();
        for(int i = 1;i <= n;i++){
            nums.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i <= n;i++){
             int index = k/f[n-i];
             sb.append(nums.get(index));
             nums.remove(nums.get(index));
             k-=index*f[n-i];
        }
        return sb.toString();
    }

}
