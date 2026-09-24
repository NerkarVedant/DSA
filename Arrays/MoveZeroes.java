class Solution {
    public void moveZeroes(int[] nums) {


        //Brute force

//        int len=nums.length;
//        for (int i = 0; i < len; i++) {
//            if (nums[i]==0){
//                for (int j = i+1; j <len ; j++) {
//                    if (nums[j] != 0){
//                        nums[i]=nums[j];
//                        nums[j]=0;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.print(Arrays.toString(nums));



        // Two Pointer
//        int insertPos = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                int temp = nums[insertPos];
//                nums[insertPos] = nums[i];
//                nums[i] = temp;
//                insertPos++;
//            }
//        }
//        System.out.print(Arrays.toString(nums));

        //better and easier

//        int insertPos = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 0){
//                insertPos = i;
//                break;
//            }
//        }
//        if (insertPos == -1){
//            System.out.print(Arrays.toString(nums));
//        }
//        else {
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] != 0 && i > insertPos) {
//                    nums[insertPos] = nums[i];
//                    insertPos++;
//                }
//            }
//            for (int i = insertPos; i < nums.length; i++) {
//                nums[i] = 0;
//            }
//            System.out.print(Arrays.toString(nums));
//        }

        //easy no thinking #dont overthink
        if (nums.length == 1) {
            System.out.print(Arrays.toString(nums));
            return;
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }


        while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        System.out.print(Arrays.toString(nums));
    }
}


void main() {

    Solution sol= new Solution();

    int[] arr={0,1,0,3,12};
    sol.moveZeroes(arr); // Expected: [1, 3, 12, 0, 0]

    int[] arr1={0};
    sol.moveZeroes(arr1); // Expected: [0]

    int[] nums = {1, 2, 3};
    sol.moveZeroes(nums); // Expected: [1, 2, 3]

    int[] allZeros = {0, 0, 0, 0};
    sol.moveZeroes(allZeros); // Expected: [0, 0, 0, 0]

    int[] noZeros = {5, 8, 2, 1};
    sol.moveZeroes(noZeros); // Expected: [5, 8, 2, 1]

    int[] zerosAtEnds = {0, 1, 2, 0, 3, 0};
    sol.moveZeroes(zerosAtEnds); // Expected: [1, 2, 3, 0, 0, 0]

    int[] singleElementZero = {0};
    sol.moveZeroes(singleElementZero); // Expected: [0]

    int[] singleElementNonZero = {1};
    sol.moveZeroes(singleElementNonZero); // Expected: [1]

    int[] emptyArray = {};
    sol.moveZeroes(emptyArray); // Expected: []

}