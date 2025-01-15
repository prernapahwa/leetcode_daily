class Solution {
    public boolean isPalindrome(String s) {
        String extract = "";
        // s = s.toLowerCase();
        extract = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // for(int i = 0; i < s.length(); i++) {
        //     if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a') {
        //         extract += s.charAt(i);
        //     }
        // }
        //amanaplanacanalpanama
        //check palindrome
        int left = 0;
        int right = extract.length()-1;
        while(left < right) {
            if(extract.charAt(left) != extract.charAt(right)) {
                return false;
            }
            else {
                left ++;
                right --;
            }
        }
        return true;
    }
}
//A man, a plan, a canal: Panama
//amanaplanacanalpanama