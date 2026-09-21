class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // All digits were 9 (e.g. [9,9,9] -> [1,0,0,0])
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}

void main() {
    Solution sol = new Solution();

    // Test 1: [1,2,3] -> [1,2,4]
    int[] t1 = sol.plusOne(new int[]{1, 2, 3});
    System.out.println(java.util.Arrays.toString(t1)); // [1, 2, 4]

    // Test 2: [9] -> [1,0]
    int[] t2 = sol.plusOne(new int[]{9});
    System.out.println(java.util.Arrays.toString(t2)); // [1, 0]

    // Test 3: [9,9,9] -> [1,0,0,0]
    int[] t3 = sol.plusOne(new int[]{9, 9, 9});
    System.out.println(java.util.Arrays.toString(t3)); // [1, 0, 0, 0]

    // Test 4: [4,3,2,1] -> [4,3,2,2]
    int[] t4 = sol.plusOne(new int[]{4, 3, 2, 1});
    System.out.println(java.util.Arrays.toString(t4)); // [4, 3, 2, 2]
}