class Solution {
    public boolean isSubsequence(String s, String t) {
    int i = 0; // Pointer for string s
        int j = 0; // Pointer for string t
        
        while (i < s.length() && j < t.length()) {
            // If characters match, move the pointer for s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move the pointer for t
            j++;
        }
        
        // If i reaches the length of s, all characters were found in order
        return i == s.length();
    }
}