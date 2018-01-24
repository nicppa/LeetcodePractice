package SearchForARange;

public class Solution {
    //TLE
//    public int[] searchRange(int[] nums, int target) {
//        int[] result = {-1,-1};
//        if(nums.length == 0){
//            return result;
//        }
//        int left = 0,right = nums.length - 1;
//        while(left < right){
//            int mid = (right + left)/2;
//            if(nums[mid] == target){
//                int i = mid;
//                while(nums[i] == nums[i-1]){
//                    i--;
//                }
//                result[0] = i;
//                i = mid;
//                while(nums[i]==nums[i+1]){
//                    i++;
//                }
//                result[1] = i;
//            }else if(nums[mid] > target){
//                right = mid - 1;
//            }else{
//                left = mid + 1;
//            }
//        }
//        return result;
//    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int idx = -1;
        int left = 0,right = nums.length - 1;
        while(left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if(nums[mid] == target){
                idx = mid;
            }
        }
        result[0] = idx;
        idx = -1;
        left = 0;
        right = nums.length - 1;
        while(left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] >= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if(nums[mid] == target){
                idx = mid;
            }
        }
        result[1] = idx;
        return result;
    }
}
