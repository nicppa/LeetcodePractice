package ContainerWithMostWater;

public class ContainerWithMostWater {
//       Time Limit Exceeded
//    public int maxArea(int[] height) {
//        int maxArea = 0;
//        for(int i = 0;i < height.length;i++){
//            for(int j = i+1;j < height.length;j++){
//                maxArea = Math.max(maxArea,(j-i)*Math.min(height[i],height[j]));
//            }
//        }
//        return maxArea;
//    }
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0,r = height.length-1;
        while(l < r){
            maxArea = Math.max(maxArea,(r-l)*Math.min(height[r],height[l]));
            if(height[r]>height[l]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}
