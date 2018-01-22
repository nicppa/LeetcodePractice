package NextPermutation;

import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <= 1){
            return;
        }
        int i = nums.length - 1;
        for(;i > 0;i--){
            if(nums[i] > nums[i-1]){
                break;
            }
        }
        if(i != 0){
            int j = nums.length - 1;
            for(;j>=i;j--){
                if(nums[i-1] < nums[j]){
                    break;
                }
            }
            swap(nums,i-1,j);
        }
        reverse(nums, i, nums.length - 1);
    }
    public void swap(int a[],int i,int j){
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
    public void reverse(int a[],int i,int j){
        for(;i < j;i++,j--){
            swap(a,i,j);
        }
    }

}
