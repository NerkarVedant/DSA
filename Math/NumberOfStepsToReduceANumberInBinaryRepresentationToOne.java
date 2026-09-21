class Solution {
    public int numSteps(String s) {

//        int steps = 0;
//        StringBuilder sb = new StringBuilder(s);
//        while (sb.length() > 1) {
//            int lastIdx = sb.length() - 1;
//            if (sb.charAt(lastIdx) == '0') {
//                steps++;
//                sb.deleteCharAt(lastIdx);
//            } else {
//                steps++;
//                // Simulate addition: propagate carry
//                int i = lastIdx;
//                while (i >= 0 && sb.charAt(i) == '1') {
//                    sb.setCharAt(i, '0');
//                    i--;
//                }
//                if (i >= 0) {
//                    sb.setCharAt(i, '1');
//                } else {
//                    sb.insert(0, '1');
//                }
//            }
//        }
//        return steps;
        int steps = 0;
        int carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            int effectiveBit = (s.charAt(i) - '0') + carry;
            if (effectiveBit == 0) {
                steps++;
                carry = 0;
            } else if (effectiveBit == 1) {
                steps += 2;
                carry = 1;
            } else if (effectiveBit == 2) {
                steps++;
                carry = 1;
            }

        }
        if (carry==1){
            steps++;
        }
        return steps;

    }

}



void main() {
    Solution sol = new Solution();
    // Test case 1: Input "1101" (13 in decimal)
    System.out.println("Steps for 1101: " + sol.numSteps("1101")); // Expected: 6
    // Test case 2: Input "10" (2 in decimal)
    System.out.println("Steps for 10: " + sol.numSteps("10")); // Expected: 1
    // Test case 3: Input "1" (1 in decimal)
    System.out.println("Steps for 1: " + sol.numSteps("1")); // Expected: 0
    // Test case 4: Input "1111011110000011100000110001011011110010111001010111110001"
    System.out.println("Steps for large input: " + sol.numSteps("1111011110000011100000110001011011110010111001010111110001"));
    // Additional test cases
    // Test case 5: Input "100" (4 in decimal)
    System.out.println("Steps for 100: " + sol.numSteps("100")); // Expected: 2
    // Test case 6: Input "101" (5 in decimal)
    System.out.println("Steps for 101: " + sol.numSteps("101")); // Expected: 5
    // Test case 7: Input "111" (7 in decimal)
    System.out.println("Steps for 111: " + sol.numSteps("111")); // Expected: 4
    // Test case 8: Input "1000" (8 in decimal)
    System.out.println("Steps for 1000: " + sol.numSteps("1000")); // Expected: 3
    // Test case 9: Input "1010" (10 in decimal)
    System.out.println("Steps for 1010: " + sol.numSteps("1010")); // Expected: 5
    // Test case 10: Input "1111" (15 in decimal)
    System.out.println("Steps for 1111: " + sol.numSteps("1111")); // Expected: 7
    // Test case 11: Input "100000" (32 in decimal)
    System.out.println("Steps for 100000: " + sol.numSteps("100000")); // Expected: 5
    // Test case 12: Input "101010" (42 in decimal)
    System.out.println("Steps for 101010: " + sol.numSteps("101010")); // Expected: 9
    // Test case 13: Input "110110" (54 in decimal)
    System.out.println("Steps for 110110: " + sol.numSteps("110110")); // Expected: 9
    // Test case 14: Input "1000000000000000" (32768 in decimal)
    System.out.println("Steps for 1000000000000000: " + sol.numSteps("1000000000000000")); // Expected: 15
}
