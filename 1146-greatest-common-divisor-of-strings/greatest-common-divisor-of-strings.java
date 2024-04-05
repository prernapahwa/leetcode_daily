class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int size2 = str2.length();
        for(int i = size2-1; i >= 0; i--) {
            String temp1 = str1;
            String temp2 = str2;
            String ans = str2.substring(0,i+1);
        System.out.println(ans);
            temp1 = temp1.replace(ans, "");
            temp2 = temp2.replace(ans, "");
            if(temp1.isEmpty() && temp2.isEmpty()) {
                return ans;
            }
        }
        return "";
    }
}