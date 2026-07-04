class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>(); 

        for(String s : strs) {
            int[] count = new int[26]; 

            for(char c : s.toCharArray()) {
                count[c -'a']++; //count the frequency of each value in that 
            }

            String key = Arrays.toString(count); //make the count into a stirng 
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s); //if it isnt new throw into that keys bucket  

        }
        return new ArrayList<>(res.values());
    }
}
