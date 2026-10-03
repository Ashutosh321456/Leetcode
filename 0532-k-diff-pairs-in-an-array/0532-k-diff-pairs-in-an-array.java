class Solution {
    public int findPairs(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        int pairs = 0;
        for(int ele : map.keySet()){
            if(k==0) {
                if(map.get(ele)>1) pairs++;
            }
            else{
            int rem1 = ele+k;
            if(map.containsKey(rem1)) pairs += 1;
            }
        }
        return pairs;
    }
}