class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if(m.containsKey(required)) {
                ans[0] = i;
                ans[1] = m.get(required);
                break;
            }
            m.put(nums[i], i);
        }
        return ans;
    }
}
// [2, 7, 11, 15]
// target = 9 
// 2-> 9-2 = 7 
