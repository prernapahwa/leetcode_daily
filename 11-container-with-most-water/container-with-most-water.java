class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int j=height.length-1;
        while(i<=j){
            if(height[i]<=height[j]){
                if(height[i]*(j-i)>max){
                    max = height[i]*(j-i);
                    i++;
                }
                else {
                   i++;
                }
            }
            else if(height[j]<height[i]){
                if(height[j]*(j-i)>max){
                    max=height[j]*(j-i);
                    j--;
                }
                else {
                    j--;
                }
            }
//             else{
//                 if(height[i]*(j-i)>max){
//                     max=height[i]*(j-i);
//                     i++;
//                 }
                
//             }
        }
        return max;
    }
}