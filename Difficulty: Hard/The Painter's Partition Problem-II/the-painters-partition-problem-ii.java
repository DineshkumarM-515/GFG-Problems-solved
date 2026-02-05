class Solution {
    public int Partition(int[] arr,int time){
        int painterCnt = 1;
        int totalTime = 0;
        for(int i=0;i<arr.length;i++){
            if(totalTime + arr[i] <= time){
                totalTime += arr[i];
            }
            else{
                painterCnt += 1;
                totalTime = arr[i];
            }
        }
        
        return painterCnt;
    }
    public int minTime(int[] arr, int k) {
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
            int mid = left+(right - left)/2;
            int painters = Partition(arr,mid);
            if(painters > k){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
}
