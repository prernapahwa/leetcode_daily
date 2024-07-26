class Solution {
    public int removeDuplicates(int[] nums) {
        /*[0,0,1,1,1,2,2,3,3,4]
             i j
           0 1 
        
        
        
        */
        int valid = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[valid]!= nums[i]) {
                valid++;
                nums[valid] = nums[i];
            }
        }
        return valid+1;
    }
}