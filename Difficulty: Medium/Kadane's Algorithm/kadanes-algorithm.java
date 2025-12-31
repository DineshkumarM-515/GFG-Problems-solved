class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int globalmax = arr[0];
        int currentmax = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(currentmax + arr[i] > arr[i]) {
                currentmax = currentmax + arr[i];
            } else {
                currentmax = arr[i];
            }
            
            if(currentmax > globalmax) globalmax = currentmax;
        }
        
        return globalmax;
    }
}
