class Solution {
    public boolean canWePlace(int[] stalls,int dist,int cows){
        int prev = stalls[0];
        int cowCount = 1;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-prev >= dist){
                cowCount++;
                prev = stalls[i];
            }
        }
        
        return cowCount >= cows;
    }
    
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int left = 1;
        int right = stalls[n-1]-stalls[0];
        while(left <= right){
            int mid = left+(right-left)/2;
            if(canWePlace(stalls,mid,k)){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
        return right;
    }
}