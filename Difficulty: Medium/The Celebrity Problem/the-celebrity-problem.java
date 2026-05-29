class Solution {
    public int celebrity(int mat[][]) {
        // code here
        
        int n = mat.length;
        int m = mat[0].length;
        
        int[] col = new int[m];
        int[] row = new int[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0) row[i]++;
                if(mat[i][j] == 1) col[j]++;
            }
        }
        
        for(int i=0;i<n;i++){
            if(row[i] == n-1 && col[i] == n) return i;
        }
        
        return -1;
    }
}