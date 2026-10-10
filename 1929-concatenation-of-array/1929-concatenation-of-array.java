class Solution {
    public int[] getConcatenation(int[] nums) {
        int []ans = new int[nums.length*2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            ans[k]=nums[i];
            k++;
        }
        for(int i=0;i<nums.length;i++){
            ans[k]=nums[i];
            k++;
        }
        return ans;
        
    }
}