class Solution {
    public boolean isAnagram(String s, String t) {
 if (s.length() != t.length()) {
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(String.valueOf(s.charAt(i)), map1.getOrDefault(String.valueOf(s.charAt(i)),0) + 1);
            map2.put(String.valueOf(t.charAt(i)), map2.getOrDefault(String.valueOf(t.charAt(i)),0) + 1);
        }
        return map1.equals(map2);
    }
}
