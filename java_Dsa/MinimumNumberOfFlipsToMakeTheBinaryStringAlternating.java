class Solution {
    public int minFlips(String s) {
//        int len=s.length();
//        int oneAtEven=0;
//        int oneAtOdd=0;
//        int zeroAtEven=0;
//        int zeroAtOdd=0;
//        for (int i = 0; i < len; i++) {
//            if(i%2==0){
//                if(s.charAt(i)=='1'){
//                    oneAtEven++;
//                }
//            }
//            else {
//                if(s.charAt(i)=='1'){
//                    oneAtOdd++;
//                }
//            }
//        }
//        int evenCount = (len + 1) / 2;
//        int oddCount = len / 2;
//        zeroAtEven = evenCount - oneAtEven;
//        zeroAtOdd = oddCount - oneAtOdd;
//
//        int min=Math.min(Math.min(oneAtEven,oneAtOdd),Math.min(zeroAtEven,zeroAtOdd));
//
//        if (min == oneAtEven) {
//            return oneAtEven + zeroAtOdd;
//        } else if (min == oneAtOdd) {
//            return oneAtOdd + zeroAtEven;
//        } else if (min == zeroAtEven) {
//            return zeroAtEven + oneAtOdd;
//        } else {
//            return zeroAtOdd + oneAtEven;
//        }

        //allowed without rotation
//        int mismatch0 = 0;
//        int mismatch1 = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            char expect0 = (i % 2 == 0) ? '0' : '1';
//            char expect1 = (i % 2 == 0) ? '1' : '0';
//
//            if (c != expect0) mismatch0++;
//            if (c != expect1) mismatch1++;
//        }
//
//        return Math.min(mismatch0, mismatch1);

        //with rotation
            int n = s.length();
            String ss = s + s;

            int diff1 = 0, diff2 = 0;
            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < ss.length(); i++) {

                char c = ss.charAt(i);
                char p1 = (i % 2 == 0) ? '0' : '1';
                char p2 = (i % 2 == 0) ? '1' : '0';

                if (c != p1) diff1++;
                if (c != p2) diff2++;

                if (i >= n) {
                    char old = ss.charAt(i - n);
                    char op1 = ((i - n) % 2 == 0) ? '0' : '1';
                    char op2 = ((i - n) % 2 == 0) ? '1' : '0';

                    if (old != op1) diff1--;
                    if (old != op2) diff2--;
                }

                if (i >= n - 1) {
                    ans = Math.min(ans, Math.min(diff1, diff2));
                }
            }

        return ans;
    }


}


void main() {

    Solution sol=new Solution();
    System.out.println(sol.minFlips("111000"));
    System.out.println(sol.minFlips("010"));
    System.out.println(sol.minFlips("1110"));




}