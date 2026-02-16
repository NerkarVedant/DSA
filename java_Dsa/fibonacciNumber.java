class Solution {
    public int fib(int n) {
//        if (n == 1) {
//            return 1;
//        }if (n == 0) {
//            return 0;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }

        if(n<=1) return n;
        /* Declare an array to store Fibonacci numbers. */
        int[] f = new int[n + 1]; // 1 extra to handle case, n = 0

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            /* Add the previous 2 numbers in the series and store it */
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n-1];
    }

}




void main() {
    int n = 6;
    Solution sol = new Solution();
    System.out.println(sol.fib(n));
}