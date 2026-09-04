class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int j =0;
        while(j<nums.length){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i =0;i<=j;i++){
            if(nums[i]>max) max = nums[i];
        }
        for(int i=j;i<nums.length;i++){
            if(nums[i]<min) min = nums[i];
        }
        
        if((max-min)<=k) return j;
        j++;
        }
        return -1;
    }
}