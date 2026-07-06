class Solution {
    public int firstUniqChar(String str) {
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)) return str.indexOf(ch);
        }
        return -1;
    }
}