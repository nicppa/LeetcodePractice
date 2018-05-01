package SearchInRotatedSortedArrayII;

public class Solution {
    public boolean search(int[] nums, int target) {
        int i = 0,j = nums.length-1;
        while( i <= j ){
            int mid = (i + j) / 2;
            if(nums[mid] == target) {
                return true;
            }else if(nums[mid] == nums[i]){
                i++;
            }else if(nums[i] < nums[mid]){
                if(nums[i] <=target && target < nums[mid]){
                    j = mid - 1;
                }else{
                    i = mid + 1;
                }
            }else{
                if(nums[mid] >= target&& target < nums[j]){
                    i = mid + 1;
                }else{
                    j = mid - 1;
                }
            }
        }
        return false;
    }
}
