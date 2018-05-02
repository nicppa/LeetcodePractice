package LargestRectangleInHistogram;

import java.util.Stack;

public class Solution {
    public static int largestRectangleArea(int[] height){
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        for(int i = 0; i <= height.length;i++){
            int h = (i == height.length)?0:height[i];
            if(stack.isEmpty() || h >= height[stack.peek()]){
                stack.push(i);
            }else{
                int tp = stack.pop();
                maxarea = Math.max(maxarea,height[tp]*(stack.isEmpty()?i:i-1- stack.peek()));
                i--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args){
        int a[] = {2,1,5,6,2,3};
        int b = largestRectangleArea(a);
    }
}
