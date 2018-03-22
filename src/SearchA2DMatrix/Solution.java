package SearchA2DMatrix;

public class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        if(matrix.length == 0||matrix[0].length==0){
//            return false;
//        }
//        int i = matrix.length;
//        while(i > 0){
//            if(target >= matrix[--i][0]){
//                break;
//            }
//        }
//        return binarySearch(matrix[i],target,0,matrix[i].length-1);
//    }
//    public boolean binarySearch(int[] a,int target,int left,int right){
//        while(left <= right){
//            int mid = (left + right)/2;
//            if(a[mid] == target){
//                return true;
//            }else if(a[mid] > target){
//                right = mid - 1;
//            }else{
//                left = mid + 1;
//            }
//        }
//        return false;
//    }
public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix.length == 0|| matrix[0].length == 0){
        return false;
    }
    int n = matrix.length;
    int m = matrix[0].length;
    int l = 0,r = n * m - 1;
    while(l <= r){
        int mid = (l + r) >> 1;
        if(matrix[mid/m][mid%m] == target){
            return true;
        }else if (matrix[mid/m][mid%m] > target){
            r = mid - 1;
        }else{
            l = mid +1;
        }
    }
    return false;
}
}
