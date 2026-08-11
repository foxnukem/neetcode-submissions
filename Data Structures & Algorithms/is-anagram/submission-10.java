class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int size = s.length();
        int[] sChars = new int[size];
        int[] tChars = new int[size];

        for (int i = 0; i < size; i++) {
            sChars[i] = s.charAt(i) - 'a';
            tChars[i] = t.charAt(i) - 'a';
        }
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
