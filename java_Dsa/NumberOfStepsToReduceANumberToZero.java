class Solution {
    public int numberOfSteps(int num) {
        // Normal loops
        int count=0;
        while(num!=0){
            if (num % 2 ==0){
                num=num/2;
                count++;
            }
            else{
                num--;
                count++;
            }
        }
        return count;

        // Using recursion
//        if (num == 0) return 0;
//        if (num % 2 == 0) {
//            return 1 + numberOfSteps(num / 2);
//        } else {
//            return 1 + numberOfSteps(num - 1);
//        }
    }
}

void main() {
    Solution sol =new Solution();
    System.out.println("Number = 14, Result = " + sol.numberOfSteps(14) + " Expected 6" );
    System.out.println("Number = 8, Result = " + sol.numberOfSteps(8) + " Expected 4" );
    System.out.println("Number = 123, Result = " + sol.numberOfSteps(123) + " Expected 12" );
    System.out.println("Number = 0, Result = " + sol.numberOfSteps(0) + " Expected 0" );
    System.out.println("Number = 1, Result = " + sol.numberOfSteps(1) + " Expected 1" );
    System.out.println("Number = 2, Result = " + sol.numberOfSteps(2) + " Expected 2" );
}