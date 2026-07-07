class Solution {
    public int lengthOfLastWord(String s) {
        String[] words =  s.trim().split("\\s+");
        StringBuilder result = new StringBuilder(); 
        int n = words.length-1;
       result.append(words[n]);
       return result.length();
    }
}