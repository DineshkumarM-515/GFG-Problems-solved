class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int left = 0;
        int right = arr.length-1;
        int idx = -1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] <= x){
                idx = mid;
                left = mid+1;
            } 
            if(arr[mid] > x) right = mid-1;
        }
        return idx;
    }
}
