// Problem Explanation:
//
// In a binary string (a string containing only '0's and '1's), a segment is a contiguous (unbroken) sequence of the same character.
// For example, in the string "110011", the segments are: "11", "00", and "11".
//
// In this problem, we are interested in segments of ones (i.e., consecutive '1's).
// A segment of ones is a sequence of one or more '1's that are not separated by any '0'.
//
// The task:
// Given a binary string, determine if it contains at most one segment of ones.
// This means all the '1's in the string must appear together, without being split by any '0'.
//
// Examples:
// 1. Input: "1110"   => Output: true   (All '1's are together)
// 2. Input: "1001"   => Output: false  (There are two segments of ones: "1" and "1")
// 3. Input: "110011" => Output: false  (There are two segments of ones: "11" and "11")
// 4. Input: "000"    => Output: true   (No '1's, so at most one segment)
// 5. Input: "1"      => Output: true   (Single segment of ones)
//
// Approach:
// If the string contains the substring "01", it means a segment of ones has ended and a new segment could start later.
// So, if "01" is present, there is more than one segment of ones.
// Otherwise, there is at most one segment of ones.
//
// Implementation below:

class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}

void main() {
    Solution sol =new Solution();
    System.out.println(sol.checkOnesSegment("1001"));
    System.out.println(sol.checkOnesSegment("110"));

}