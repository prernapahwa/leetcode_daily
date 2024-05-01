class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int value : nums1) {
            map.put(value, map.getOrDefault(value, 0) + 1); 
        }
        for (int value : nums2) {
            map2.put(value, map.getOrDefault(value, 0) + 1);  
        }
        for (Integer key : map.keySet()){
           if (!map2.containsKey(key)){
             ans1.add(key);
           }
        }
        for (Integer key : map2.keySet()){
           if (!map.containsKey(key)){
                ans2.add(key);
           }
        }
        return Arrays.asList(ans1, ans2);
    }
}