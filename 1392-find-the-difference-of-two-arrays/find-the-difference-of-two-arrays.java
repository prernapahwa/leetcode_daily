class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        HashSet<Integer> map = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();
        for (int value : nums1) {
            map.add(value); 
        }
        for (int value : nums2) {
            map2.add(value);  
        }
        for (Integer key : map){
           if (!map2.contains(key)){
             ans1.add(key);
           }
        }
        for (Integer key : map2){
           if (!map.contains(key)){
                ans2.add(key);
           }
        }
        return Arrays.asList(ans1, ans2);
    }
}