class Solution {
    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0) return new int[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}



void main() {
    Solution sol = new Solution();
    System.out.println(Arrays.toString(sol.runningSum(new int[]{1, 2, 3, 4, 5})));
    System.out.println(Arrays.toString(sol.runningSum(new int[]{1, 1, 1, 1, 1})));


}