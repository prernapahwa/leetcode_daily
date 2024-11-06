class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int[] temp = new int[n];
        int ans=0;
        for(int i=0;i<n;i++) {
            temp[i]=ans+nums[i];
            ans=temp[i];
            if(temp[i]<0) {
                //temp[i]=0;
                ans=0;
            }
        }
        ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(temp[i]>ans) {
                ans=temp[i];
            }
        }
        return ans;
    }
}


//[-2,1,-3,4,-1,2,1,-5,4]
// sum = 1
// -2 = 3
// 1 = -2, 1--2-1 = 2 
// -3 = 1, 5
// 4 =  -2, 1



