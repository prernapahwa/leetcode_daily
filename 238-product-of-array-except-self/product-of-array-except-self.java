class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes = 0;
        int multiply = 1;
        for(int i = 0; i < nums.length; i++ ) {
            if(nums[i] == 0) {
                zeroes++;
            }
            else {
                multiply *= nums[i];
            }
        }
        if(zeroes == 0) {
            for(int i = 0; i < nums.length;i++) {
                nums[i] = multiply / nums[i];
            }
        }
        else if(zeroes == 1) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    nums[i] = multiply;
                }
                else {
                    nums[i] = 0;
                }
            }
        }
        else {
            for(int i = 0; i < nums.length;i++) {
                nums[i] = 0;
            }
        }
        return nums;
    }
}