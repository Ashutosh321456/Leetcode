class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int min =nums[0];
        int max= nums[nums.length-1];
        
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        for(int i = nums[0] ; i<=nums[nums.length-1] ; i++){
            if(!set.contains(i)) result.add(i);
        }
        return result;
    }
}