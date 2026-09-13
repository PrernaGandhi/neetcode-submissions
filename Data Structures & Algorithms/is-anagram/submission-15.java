class Solution {
    // public boolean isAnagram(String s, String t) {
    //     // sort and then check if strings are equal
    //     // N log N time complexity, space to sort
        
    //     return Arrays.equals(s.chars().sorted().toArray(), t.chars().sorted().toArray());
    // }

    public boolean isAnagram(String s, String t) {
        // freq array of O(26), add freq of first string, then subtract and then check if the freq is 0 then anagram otherwise no
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a'] += 1;
        }

        for(char ch : t.toCharArray()) {
            freq[ch - 'a'] -= 1;
        }

        for(int val: freq) {
            if(val != 0) {
                return false;
            }
        }

        return true;
    }
}
