class Solution {
    public int countOperations(int num1, int num2) {
        // without recursion

        int count =0;
        while (num1 !=0 && num2 !=0){
            if(num1>=num2){
                num1=num1-num2;
                count++;
            }
            else{
                num2=num2-num1;
                count++;
            }
        }
        return count;


        // with recursion
//        if (num1 == 0 || num2 == 0) return 0;
//        if (num1>=num2){
//            return 1 + countOperations((num1-num2), num2);
//        }
//        else {
//            return 1 + countOperations(num1,(num2-num1));
//        }
    }
}

void main() {
    Solution sol = new Solution();
    System.out.println("num1 = 2, num2 = 3, Result = " + sol.countOperations(2, 3) + " Expected 3");
    System.out.println("num1 = 10, num2 = 10, Result = " + sol.countOperations(10, 10) + " Expected 1");
    System.out.println("num1 = 0, num2 = 5, Result = " + sol.countOperations(0, 5) + " Expected 0");
    System.out.println("num1 = 5, num2 = 0, Result = " + sol.countOperations(5, 0) + " Expected 0");
    System.out.println("num1 = 7, num2 = 3, Result = " + sol.countOperations(7, 3) + " Expected 5");
    System.out.println("num1 = 1, num2 = 1, Result = " + sol.countOperations(1, 1) + " Expected 1");
}