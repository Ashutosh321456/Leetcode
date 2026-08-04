class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int min =nums[0];
        int max= nums[nums.length-1];
        
        ArrayList<Integer>result=new ArrayList<>();
        int i=0;
    
        while(min<max){
            if(nums[i]==min){
                i++;
                min++;
            }
            if(nums[i]!=min){
                result.add(min) ;
            
                min++;
                
            }
        }
        return result;
    }
}