// User function Template for Java

class Solution {
    public int[] findMaxRow(int mat[][], int N) {
        // code here
        int rowno = 0;
        int maxval = 0;
        for(int i=0;i<N;i++){
            int Occurance = BinarySearch(mat[i],N);
            if(Occurance != -1){
                int currentcnt = N - Occurance;
                if(currentcnt > maxval){
                    maxval = currentcnt;
                    rowno = i;
                }
            }
        }
        return new int[]{rowno,maxval};
    }
    
    public int BinarySearch(int row[],int n){
        int left = 0;
        int right = n-1;
        int pos = -1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(row[mid]==1){
                pos = mid;
                right = mid - 1;
            }
            else{
                left = mid+1;
            }
        }
        return pos;
    }
};