package ThreeSumClosest;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0;
        int ans = nums[0] + nums[1] + nums[nums.length - 1];
        while(l < nums.length - 2 ){
            int m = l + 1;
            int r = nums.length - 1;
            while(m < r){
                int sum =  nums[l] + nums[m] + nums[r];
                if(sum > target){
                    while(nums[r--]==nums[r]&&m < r);
                }else if (sum < target){
                    while(nums[m]==nums[++m]&&m < r);
                }else{
                    return sum;
                }
                if(Math.abs(target-ans)>Math.abs(target-sum)){
                    ans = sum;
                }
            }
            while(nums[l]==nums[++l]&&l<nums.length-2);
        }
        return ans;
    }
}
