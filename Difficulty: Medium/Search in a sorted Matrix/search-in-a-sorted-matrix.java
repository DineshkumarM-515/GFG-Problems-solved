class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int left = 0;
        int right = n*m-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            int row = mid/m;
            int col = mid%m;
            if(mat[row][col] == x) return true;
            else if(mat[row][col] < x) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}
