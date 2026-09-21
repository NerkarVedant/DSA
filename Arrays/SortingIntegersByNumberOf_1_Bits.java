import java.util.Arrays;


//TODO
// Learn
class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    int cmp = Integer.bitCount(a) - Integer.bitCount(b);
                    return cmp != 0 ? cmp : a - b;
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

void main() {
        Solution sol = new Solution();
        int[] test1 = {0,1,2,3,4,5,6,7,8};
        int[] result1 = sol.sortByBits(test1);
        System.out.println("Test 1: " + Arrays.toString(result1));

        int[] test2 = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] result2 = sol.sortByBits(test2);
        System.out.println("Test 2: " + Arrays.toString(result2));

        int[] test3 = {3,8,3,6,5,7,9,1};
        int[] result3 = sol.sortByBits(test3);
        System.out.println("Test 3: " + Arrays.toString(result3));

        int[] test4 = {10000,10000};
        int[] result4 = sol.sortByBits(test4);
        System.out.println("Test 4: " + Arrays.toString(result4));

        int[] test5 = {2,3,5,7,11,13,17,19};
        int[] result5 = sol.sortByBits(test5);
        System.out.println("Test 5: " + Arrays.toString(result5));
}
