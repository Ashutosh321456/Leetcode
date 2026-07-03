class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> a = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i =0;i<candies.length;i++){
            if(max<candies[i]){
                max= candies[i];
                
            }
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max) a.add(Boolean.TRUE);
            else a.add(Boolean.FALSE);
        }
        return a;
    }
}