public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
    char[] asort = s.toCharArray();
    char[] tsort = t.toCharArray();
    Arrays.sort(asort);
    Arrays.sort(tsort);
    return Arrays.equals(asort,tsort);
    }
}