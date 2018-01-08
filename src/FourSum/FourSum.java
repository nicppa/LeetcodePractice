package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);


        for(int i = 0;i < nums.length-3; i ++){
            if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3] > target){
                break;
            }
            if(nums[i]+nums[nums.length-3]+nums[nums.length-2]+nums[nums.length-1] < target){
                continue;
            }
            if(i > 0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j = i + 1;j < nums.length - 2;j++){
                if(nums[i]+nums[j]+nums[j+1]+nums[j+2] > target){
                    break;
                }
                if(nums[i]+nums[j]+nums[nums.length-2]+nums[nums.length-1] < target){
                    continue;
                }
                if(j > i +1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left = j + 1;
                int right = nums.length-1;
                while(left < right ){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    }
                    if(sum <= target){
                        while(nums[left]==nums[++left]&&left<right);
                    }
                    if(sum >= target){
                        while(nums[right--]==nums[right]&&left<right);
                    }
                }
            }
        }

        return result;
    }

}
