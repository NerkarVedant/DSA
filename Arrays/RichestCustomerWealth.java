class Solution {
    public int maximumWealth(int[][] accounts) {

        int max=0;

        for (int i = 0; i < accounts.length; i++ ){

            int sum =0;

            for (int j = 0; j < accounts[i].length; j++ ){

                sum = sum + accounts[i][j];

            }

            if (sum > max){
                max=sum;
            }

        }
        return max;

    }
}

void main() {
    Solution sol = new Solution();
    int[][] accounts1 = {{1,2,3},{3,2,1}};
    System.out.println(sol.maximumWealth(accounts1)); // Expected: 6

    int[][] accounts2 = {{1,5},{7,3},{3,5}};
    System.out.println(sol.maximumWealth(accounts2)); // Expected: 10

    int[][] accounts3 = {{2,8,7},{7,1,3},{1,9,5}};
    System.out.println(sol.maximumWealth(accounts3)); // Expected: 17

    int[][] accounts4 = {{10}};
    System.out.println(sol.maximumWealth(accounts4)); // Expected: 10
}
