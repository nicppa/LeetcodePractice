package SearchInRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        if(target > nums[0]){
            int i = 1;
            for(; i < nums.length ;i++){
                if(target < nums[i]){
                    return -1;
                }else if(target == nums[i]){
                    return i;
                }
            }
        }else if(target == nums[0]){
            return 0;
        }else{
            int i = nums.length- 1;
            for(; i > 0 ; i--){
                if(target > nums[i]){
                    return -1;
                }else if(target == nums[i]){
                    return i;
                }
            }
        }
        return -1;
    }
}
