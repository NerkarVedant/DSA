class Solution {
    public int minOperations(String s) {
        // was mutating the original string and and trying to make it in
        // alternating pattern
//        char[] arr = s.toCharArray();
//        int count=0;
//        int len = arr.length;
//        for (int i = 1; i < len; i++) {
//            if ( arr[i] == arr[i-1]){
//                count++;
//                if( arr[i]=='0'){
//                    arr[i]='1';
//                }
//                else{
//                    arr[i]='0';
//                }
//            }
//        }
//        return count;

        // better logic based on the position or
        // places of the numbers
        int n = s.length();
        int mismatch0 = 0; // mismatches if pattern starts with '0'
        int mismatch1 = 0; // mismatches if pattern starts with '1'

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            char expect0 = (i % 2 == 0) ? '0' : '1';
            char expect1 = (i % 2 == 0) ? '1' : '0';
            if (ch != expect0) mismatch0++;
            if (ch != expect1) mismatch1++;
        }
        return Math.min(mismatch0, mismatch1);
    }
}


void main() {

    Solution sol= new Solution();
    String[] tests = {"1111", "", "0", "1", "0100", "10", "000"};
    int[] expected = {2, 0, 0, 0, 1, 0, 1};

    for (int i = 0; i < tests.length; i++) {
        int actual = sol.minOperations(tests[i]);
        System.out.println("Actual: " + actual + " Expected: " + expected[i]);
    }

}