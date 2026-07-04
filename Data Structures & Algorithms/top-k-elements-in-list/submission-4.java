class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer, Integer> freqMap = new HashMap<>();   

     //now let us add those elements and loop rhough this 

     for(int num : nums) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) +1); 
     } 


     //let us put this map into a list now 

     List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(freqMap.entrySet());
     entryList.sort((a, b) -> b.getValue() - a.getValue());//lambda expression //sorts it 

    List<Integer> result = new ArrayList<>();

    for(int i = 0; i < k; i++) {
        result.add(entryList.get(i).getKey());
    }

    int[] output = new int[result.size()];
for (int i = 0; i < result.size(); i++) {
    output[i] = result.get(i);
}
return output;



    }
}
