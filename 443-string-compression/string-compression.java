class Solution {
    public int compress(char[] chars) {
        int count = 0;
        String ans = "";
        for(int i = 0; i < chars.length-1; i++) {
            if(chars[i] == chars[i+1]) {
                count ++;
                //current = chars[i];
            }
            else if(chars[i]!=chars[i+1]) {
                count ++;
                ans+=chars[i];
                if(count != 1) {
                    ans+=Integer.valueOf(count);
                }
                count = 0;
            }
        }
        if(chars.length>1) {
            if(chars[chars.length-1] == chars[chars.length-2]) {
                count++;
                ans+=chars[chars.length-1];
                ans+=Integer.valueOf(count);
            }
            else {
                ans+=chars[chars.length-1];
            }
        }
        else {
            ans+=chars[chars.length-1];
        }
        System.out.println(ans);

        for(int i = 0; i < ans.length(); i++) {
            chars[i] = ans.charAt(i);;
        }
        return ans.length();
    }
}