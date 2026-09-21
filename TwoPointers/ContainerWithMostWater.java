import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maxArea(int[] height) {

        int max=0;
        int left = 0;
        int right = height.length - 1;
        while (left < right ){
            int volume = Math.min(height[left], height[right]) * (right-left);
            if (volume>max){
                max=volume;
            }
            if (height[left]>height[right]){
                right--;
            }
//            the code below is just overthinking
//            the formula is very simple even if the next height is way taller it dosent matter
//            as we are goint to multiply the width the minimim height only


//            this is greedy at its best


//            else if (height[left]==height[right]) {
//                int left1=left;
//                int right1=right;
//                while (left1<right1) {
//                    if (height[left1+1]>height[right1-1]){
//                        right1--;
//                    }
//                    else if (height[left1+1]<height[right1-1]){
//                        left1++;
//                    }
//                    else{
//                        continue;
//                    }
//                }
//            }
            else{
                left++;
            }

        }
        return max;



//so by using the method below the time complexity is n^2 so no matter what we do it will
//            out of bound always
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(0);
//
//        for (int i = 0; i < height.length; i++) {
//            for (int j = 0; j < height.length; j++) {
//                int volume = Math.min(height[i], height[j]) * Math.abs(i - j);
//                list.add(volume);
//                if (volume>list.getFirst()){
//                    list.removeFirst();
//                    list.add(volume);
//                }
//            }
//        }
//        return list.getFirst();
    }
}
void main () {

    int[] test = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    Solution sol = new Solution();
    System.out.println(sol.maxArea(test));

}