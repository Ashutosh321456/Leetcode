class Solution {
    public int maximumCount(int[] arr) {
        int low =0,high =arr.length-1;
        int countNegative =0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=0) high = mid-1;
            else low=mid+1;
        }
        countNegative = low;
         int countPositive = 0;
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=0) low=mid+1;
            else high= mid-1;
        }
        countPositive = arr.length-low;
        if(countPositive>=countNegative) return countPositive;
        else return countNegative;
    }
}