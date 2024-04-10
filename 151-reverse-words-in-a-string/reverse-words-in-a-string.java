class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        String ans = "";
        System.out.println(arr.length);
        for(int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + "*****");
            ans += (arr[i]);
            if(i>0){
                ans+= (" ");
            }
        }
        return ans.trim();
    }
}