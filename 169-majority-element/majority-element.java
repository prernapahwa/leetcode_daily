class Solution {
    public int majorityElement(int[] nums) {
        // long sum = 0;
        // int n = nums.length;
        // for(int i = 0; i < n; i ++) {
        //     sum += nums[i];
        // }  
        // int num = (n/2)+1;
        // for(int i = 0; i < n; i++)  {
        //     if(nums[i]*(num) >= sum/2) {
        //         return nums[i];
        //     }
        // }    
        // return 0;
        int candidate = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
            }
            if(candidate == nums[i]) {
                count ++;
            }
            else {
                count --;
            }
        }
        return candidate;
    }
}