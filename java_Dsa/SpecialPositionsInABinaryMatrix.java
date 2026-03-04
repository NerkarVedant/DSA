class Solution {
    public int numSpecial(int[][] mat) {

        int numberOfRows= mat.length;
        int numberOfCol= mat[0].length;

        int count=0;


        //Brute force approach

//        for (int i = 0; i < numberOfRows; i++) {
//
//            for (int j = 0; j < numberOfCol; j++) {
//
//                if (mat[i][j]==1) {
//                    boolean rowOk = true;
//                    for (int k = 0; k < numberOfCol; k++) {
//                        if (k != j && mat[i][k] == 1) {
//                            rowOk = false;
//                            break;
//                        }
//                    }
//                    if(rowOk) {
//                        boolean colOk = true;
//                        for (int k = 0; k < numberOfRows; k++) {
//                            if (k != i && mat[k][j] == 1) {
//                                colOk = false;
//                                break;
//                            }
//                        }
//                        if (rowOk && colOk) {
//                            count++;
//                        }
//                    }
//                }
//            }
//        }
//        return count;


        int[] rowSum = new int[numberOfRows];
        int[] colSum = new int[numberOfCol];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCol; j++) {

                if (mat[i][j]==1){
                    rowSum[i]++;
                    colSum[j]++;
                }
            }
        }
//        for (int i = 0; i < numberOfRows; i++) {
//            for (int j = 0; j < numberOfCol; j++) {
//                if(mat[i][j]==1 && rowSum[i]==1 && colSum[j]==1){
//                    count++;
//                }
//            }
//        }

        //more optimized
        for (int i = 0; i < numberOfRows; i++) {
            if (rowSum[i]==1){
                for (int j = 0; j < numberOfCol; j++) {
                    // Find the index of that single '1'
                    if (mat[i][j] == 1) {
                        // Now just check the column sum for this specific column
                        if (colSum[j] == 1) {
                            count++;
                        }
                        // Since rowSum[i] is 1, we found the only '1'.
                        // Break early to save inner loop cycles.
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // Test case 1
        int[][] mat1 = {
            {1, 0, 0},
            {0, 0, 1},
            {1, 0, 0}
        };
        System.out.println("Test 1 Output: " + sol.numSpecial(mat1) + " | Expected: 1");

        // Test case 2
        int[][] mat2 = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        System.out.println("Test 2 Output: " + sol.numSpecial(mat2) + " | Expected: 3");

        // Test case 3
        int[][] mat3 = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        System.out.println("Test 3 Output: " + sol.numSpecial(mat3) + " | Expected: 1");

        // Test case 4 (edge case: all zeros)
        int[][] mat4 = {
            {0, 0},
            {0, 0}
        };
        System.out.println("Test 4 Output: " + sol.numSpecial(mat4) + " | Expected: 0");
    }
}