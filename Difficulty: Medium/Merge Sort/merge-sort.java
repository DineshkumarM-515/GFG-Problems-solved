class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l < r){
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            
            merge(arr,l,mid,r);
        }
    }
    void merge(int[] arr,int l,int m,int r){
        int l1 = m-l+1;
        int l2 = r-m;
        int[] L = new int[l1];
        int[] R = new int[l2];
        
        for(int i=0;i<l1;i++){
            L[i] = arr[l+i];
        }
        
        for(int j=0;j<l2;j++){
            R[j] = arr[m+1+j];
        }
        
        int i=0,j=0,k=l;
        while(i < l1 && j < l2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i < l1){
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j < l2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}