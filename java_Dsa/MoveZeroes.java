class Solution {
    public void moveZeroes(int[] nums) {

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
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = temp;
                insertPos++;
            }
        }
        System.out.print(Arrays.toString(nums));

    }
}


void main() {

    Solution sol= new Solution();

    int[] arr={0,1,0,3,12};

    int[] arr1={0};

    sol.moveZeroes(arr);
    
}