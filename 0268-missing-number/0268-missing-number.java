class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<arr.length){
            if(arr[i]==i || arr[i]==n) i++;
            else{
                int idx = arr[i];
                int temp = arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        for( i=0;i<arr.length;i++){
            if(arr[i]!=i) return i;
        }
        return n;
        
    }
}