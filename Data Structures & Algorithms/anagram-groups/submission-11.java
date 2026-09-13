class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // calculate ascii value and put in map if not present
        // if present, add to the existing key
        // map of int, and list of string

        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs) {
            String key = ascii(s);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
            // if(map.containsKey(key)) {
            //     map.get(key).add(s);
            // } else {
            //     List<String> val = new ArrayList();
            //     val.add(s);
            //     map.put(key, val);
            // }
        }
        return new ArrayList<>(map.values());
    }

    public String ascii(String s) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch - 'a'] += 1;
        }
        return Arrays.toString(freq);
    }
}
