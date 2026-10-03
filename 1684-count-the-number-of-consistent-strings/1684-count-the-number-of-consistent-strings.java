class Solution {
    public int countConsistentStrings(String s, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        int count =0;
        for(int i =0;i<words.length;i++){
           int j =0;
           while(j<words[i].length()){
            char c = words[i].charAt(j);
            if(!set.contains(c)) break;
            j++;
           }
           if(j==words[i].length()) count++;
        
        }
        return count;
    }
}