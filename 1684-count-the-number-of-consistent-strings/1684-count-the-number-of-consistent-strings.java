class Solution {
    public int countConsistentStrings(String s, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count =0;
        for(int i =0;i<words.length;i++){
           int j =0;
           while(j<words[i].length()){
            char c = words[i].charAt(j);
            if(!map.containsKey(c)) break;
            j++;
           }
           if(j==words[i].length()) count++;
        
        }
        return count;
    }
}