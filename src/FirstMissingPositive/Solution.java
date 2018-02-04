package FirstMissingPositive;

import java.util.Arrays;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] <= 0){
                continue;
            }else if(count == nums[i]){
                while(i<nums.length-1&&nums[i]==nums[i+1]){
                    i++;
                }
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
}
