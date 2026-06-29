class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*(len)];
        for (int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[(len+i)] = nums[i];
        }
        return ans;
    }
}

void main(){
        Solution sol = new Solution();
        int[] nums = {1,3,2,1};
        int[] result = sol.getConcatenation(nums);
        System.out.print("Result: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
