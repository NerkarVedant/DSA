// LeetCode 1009: Complement of Base 10 Integer
// In-depth explanation:
// Problem: Given a non-negative integer n, return the complement of its binary representation as a base-10 integer.
// The complement is formed by flipping all bits in the binary representation of n.
//
// Example: n = 5 (binary: 101) => complement: 2 (binary: 010)
//
// Solution Logic:
// 1. Special case: If n == 0, its complement is 1 (since 0 in binary is '0', complement is '1').
// 2. To flip only the bits present in n, create a mask with all bits set to 1, matching the length of n in binary.
//    For n = 5 (101), mask should be 111 (7 in decimal).
// 3. Use bitwise NOT (~) to flip all bits of n, then use the mask to keep only the relevant bits.
//
// Step-by-step for n = 5:
// - n = 5 (binary: 101)
// - mask starts at 1 (binary: 1)
// - Loop 1: mask = 10, temp = 2
// - Loop 2: mask = 100, temp = 1
// - Loop 3: mask = 1000, temp = 0
// - mask - 1 = 111 (binary: 7)
// - ~n = ...11111111111111111111111111111010 (in 32 bits)
// - (~n) & 7 = 2 (binary: 010)
//
// The code below implements this logic and provides test cases for verification.

class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int mask = 1;
        int temp = n;
        while (temp > 0) {
            mask <<= 1;
            temp >>= 1;
        }
        return (~n) & (mask - 1);
    }
}

// Prints the input, output, and expected value for a test case
void printTestCase(int n, int expected){
    Solution sol = new Solution();
    int result = sol.bitwiseComplement(n);
    System.out.println("Input: " + n + ", Output: " + result + ", Expected: " + expected);
}

// Runs several test cases to demonstrate correctness
void main() {
    printTestCase(5, 2);   // 5 (101) -> 2 (010)
    printTestCase(7, 0);   // 7 (111) -> 0 (000)
    printTestCase(10, 5);  // 10 (1010) -> 5 (0101)
    printTestCase(0, 1);   // 0 -> 1

}