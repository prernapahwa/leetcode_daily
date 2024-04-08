class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0; 
        int j = s.length() -1;
        while(i < j) {
            System.out.print(i);
            System.out.println(j);
            if(isVowel(a[i]) && isVowel(a[j])) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            if(!isVowel(a[i])) {
                i++;
            }
            if(!isVowel(a[j])) {
                j--;
            }
        }
        return String.valueOf(a);
    }
    private boolean isVowel(char c) {
        if(c == 'a' || c== 'A' || c== 'e' || c == 'E'|| c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
            return true;
        }
        return false;
    }
}