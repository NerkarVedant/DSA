class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCount = new int[26];
        for (char c : magazine.toCharArray()) {
            letterCount[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (letterCount[c - 'a'] == 0) {
                return false;
            }
            letterCount[c - 'a']--;
        }
        return true;
    }
}


void main() {
    Solution sol = new Solution();
    System.out.println("RansomNote = 'a', Magazine = 'b', Result = " + sol.canConstruct("a", "b") + " Expected false");
    System.out.println("RansomNote = 'aa', Magazine = 'ab', Result = " + sol.canConstruct("aa", "ab") + " Expected false");
    System.out.println("RansomNote = 'aa', Magazine = 'aab', Result = " + sol.canConstruct("aa", "aab") + " Expected true");
}