package TrappingRainWater;

public class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int count = 0;
        while(left <= right ){
            leftmax = Math.max(leftmax,height[left]);
            rightmax = Math.max(rightmax,height[right]);
            if(leftmax > rightmax){
                count+=(rightmax-height[right]);
                right--;
            }else{
                count+=(leftmax-height[left]);
                left++;
            }
        }
        return count;
    }
}
