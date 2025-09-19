class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        int[] ans = new int[k];
        // ans[0] = max;
        int counter = 0;  
        for (int i=nums.length-1; i>=0 ; i--) {
            if(nums[i] != max) {
                max = nums[i];
                ans[counter] = max;
                counter++;
            }
            if(counter == k) {
                break;
            }
        }
        return Arrays.copyOf(ans, counter);
    }
}