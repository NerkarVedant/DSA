import java.util.HashSet;
import java.util.Set;

public static class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int n : nums){
            if(!set.add(n)){
                return true;
            }
        }
        return false;
    }
}

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        // Test case 1: Contains duplicate
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test Case 1: Result: " + solution.containsDuplicate(nums1) + ", Expected: true");

        // Test case 2: No duplicate
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test Case 2: Result: " + solution.containsDuplicate(nums2) + ", Expected: false");

        // Test case 3: Empty array
        int[] nums3 = {};
        System.out.println("Test Case 3: Result: " + solution.containsDuplicate(nums3) + ", Expected: false");

        // Test case 4: Single element array
        int[] nums4 = {5};
        System.out.println("Test Case 4: Result: " + solution.containsDuplicate(nums4) + ", Expected: false");

        // Test case 5: All elements are duplicates
        int[] nums5 = {7, 7, 7, 7};
        System.out.println("Test Case 5: " + solution.containsDuplicate(nums5) + ", Expected: true"); // Expected: true

        // Test case 6: Duplicates at the end
        int[] nums6 = {1, 2, 3, 4, 5, 5};
        System.out.println("Test Case 6: " + solution.containsDuplicate(nums6) + ", Expected: true"); // Expected: true
    }
