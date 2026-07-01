class Solution {
    public int[] findErrorNums(int[] arr) {
                int n = arr.length ;
        int[] ans = new int[2];
        int i=0;
        while(i<n){
            int idx = arr[i]-1;
            if(arr[i]==i+1  || arr[idx]==arr[i]) i++;
                 else swap(arr,i,idx);    
        }
          for(i=0;i<n;i++){
                if(arr[i]!=i+1){ 
                ans[0]=arr[i];
                ans[1] =i+1;
                }
            }
        return ans;
    }
     public void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }
    }
