// User function template for java

class Solution {
    void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        
        int n = mat.length;
        int m = mat[0].length;
        k = k%m;
         if(n==0 || k==0) return mat;
        
        for(int i=0;i<n;i++){
            reverse(mat[i],0,k-1);
            reverse(mat[i],k,m-1);
            reverse(mat[i],0,m-1);
        }
        return mat;
    }
}