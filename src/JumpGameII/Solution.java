package JumpGameII;

public class Solution {
    public int jump(int[] nums) {
        int pos = 0;
        int max = 0;
        int e = 0;
        for(int i = 0; i < nums.length - 1;i++){
            max = Math.max(max,i+nums[i]);
            if( i == e ){
                pos++;
                e = max;
            }
        }
        return pos;
    }
}
