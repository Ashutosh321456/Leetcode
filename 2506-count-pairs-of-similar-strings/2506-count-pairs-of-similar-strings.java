class Solution {
    public int similarPairs(String[] words) {
        int count =0;
        for(int i =0 ; i < words.length ; i++){

            HashSet<Character> set = new HashSet<>();

            for(int k =0 ; k < words[i].length() ; k++){
                char ch = words[i].charAt(k);
                set.add(ch);

            }

                 for(int j =i+1 ; j < words.length ; j++){

                    HashSet<Character> set2 = new HashSet<>();

                    for(int m =0 ; m<words[j].length() ; m++){
                        char c = words[j].charAt(m);
                            set2.add(c);
                    }
                    if(set.equals(set2)) count++;
            }
        }
        return count;
    }
}