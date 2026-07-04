class Solution {
    public boolean isAnagram(String s, String t) {
        //let us start by thinking through methods 

        //option one brute force, this will be inefficient option two we can use a hahsmap 

        //we can associate each letter char value to an integer value and ensure 
        //the hashmaps are equal 

        if(s.length() != t.length()) {
            return false; 
        }
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1); //classic structure for this 
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1); 

        }
        return mapS.equals(mapT); 

    }
}
