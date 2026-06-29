class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;

    }
    void main() {
        Solution sol = new Solution();
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Result: " + sol.findMaxConsecutiveOnes(nums1) + " Expected: 3");

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Result: " + sol.findMaxConsecutiveOnes(nums2) + " Expected: 2");

        int[] nums3 = {0, 0, 0};
        System.out.println("Result: " + sol.findMaxConsecutiveOnes(nums3) + " Expected: 0");

        int[] nums4 = {1, 1, 1, 1};
        System.out.println("Result: " + sol.findMaxConsecutiveOnes(nums4) + " Expected: 4");
    }
}