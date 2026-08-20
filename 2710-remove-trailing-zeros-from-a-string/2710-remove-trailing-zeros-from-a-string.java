class Solution {
    public String removeTrailingZeros(String s) {
        int i = s.length()-1;
        while( i>=0 && s.charAt(i) =='0'){ 
            i--;
        }
        return s.substring(0,i+1);
    }
}