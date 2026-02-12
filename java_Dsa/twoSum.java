import java.util.HashMap;

    static class Solution {
        public int[] twoSum(int[] nums, int target) {

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++ ) {

                if (map.containsKey(target - nums[i])){
                    return new int[]{map.get(target - nums[i]), i};
                }
                else{
                    map.put(nums[i], i);
                }
            }
            return new int[]{0,0};
        }
    }
    void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,3};
        int target = 6;
        int[] result = sol.twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }
// Better solution

// why because, we are removing the complement two times
// once in the if condition and once in the return statement


//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> numMap = new HashMap<>();
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//            int complement = target - nums[i];
//            if (numMap.containsKey(complement)) {
//                return new int[]{numMap.get(complement), i};
//            }
//            numMap.put(nums[i], i);
//        }
//
//        return new int[]{}; // No solution found
//    }
//}



