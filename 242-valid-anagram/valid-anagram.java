class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> ms = new HashMap<>();
        HashMap<Character, Integer> mt = new HashMap<>();
        for(int i = 0; i < s.length() ; i++) {
            Character cs = s.charAt(i);
            Character ct = t.charAt(i);
            if(ms.containsKey(cs)) {
                ms.put(cs, ms.get(cs)+1);
            }
            else{
                ms.put(cs, 1);
            }
            if(mt.containsKey(ct)) {
                mt.put(ct, mt.get(ct)+1);
            }
            else{
                mt.put(ct, 1);
            }
        }
        return ms.equals(mt);
    }
}