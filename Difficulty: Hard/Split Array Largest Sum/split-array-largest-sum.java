class Solution {
    public int splitMax(int[] arr,int mid){
        int maxCount = 0;
        int splitCnt = 0;
        for(int i=0;i<arr.length;i++){
            if(maxCount + arr[i] <= mid){
                maxCount += arr[i];
            }
            else{
               splitCnt += 1;
               maxCount = arr[i];
            }
        }
        return splitCnt;
    }
    public int splitArray(int[] arr, int k) {
        // code here
        int max = 0;
        int sum = 0;
        for(int num:arr){
            if(num > max) max = num;
            sum += num;
        }
        int left = max;
        int right = sum;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(splitMax(arr,mid) >= k) left = mid+1;
            else right = mid-1;
        }
        return left;
    }
};