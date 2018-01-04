package ThreeSum;

import java.util.*;


public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int l = 0;
        while(l < nums.length - 2){
            if(nums[l] > 0){
                break;
            }
            int m = l + 1;
            int r = nums.length - 1;
            while(m < r){
                int sum = nums[l] + nums[m] + nums[r];
                if(sum == 0){
                    result.add(Arrays.asList(nums[l],nums[m],nums[r]));
                }
                if(sum >= 0){
                    while(nums[r--]==nums[r]&&m < r);
                }
                if(sum <= 0){
                    while(nums[m]==nums[++m]&&m < r);
                }
            }
            while(nums[l]==nums[++l]&&l<nums.length-2);
        }
        return result;
    }

}
