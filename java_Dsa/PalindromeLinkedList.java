public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Create two pointers: slow and fast
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        // Iterate the list: slow moves one step, fast moves two steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {   // skip middle node
            slow = slow.next;
        }
        // At this point, slow is at the center of the list


//        while (slow != null){
//            temp=slow.next;
//            slow.next=slow;
//            slow=temp;
//        }

        while (slow != null) {
            ListNode nextTemp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextTemp;
        }


        while (prev != null) {
            if (head.val != prev.val) {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}

// Helper function to build a linked list from an array
public static ListNode buildList(int[] arr) {
    if (arr.length == 0) return null;
    ListNode head = new ListNode(arr[0]);
    ListNode curr = head;
    for (int i = 1; i < arr.length; i++) {
        curr.next = new ListNode(arr[i]);
        curr = curr.next;
    }
    return head;
}

void main() {
    Solution sol = new Solution();
    int[][] testCases = {
        {1, 2, 2, 1}, // palindrome
        {1, 2, 3, 2, 1}, // palindrome
        {1, 2, 3, 4}, // not palindrome
        {1}, // palindrome
        {}, // palindrome (empty list)
        {1, 2}, // not palindrome
        {1, 1}, // palindrome
    };
    boolean[] expected = {
        true,
        true,
        false,
        true,
        true,
        false,
        true
    };
    for (int i = 0; i < testCases.length; i++) {
        ListNode head = buildList(testCases[i]);
        boolean result = sol.isPalindrome(head);
        System.out.println("Test " + (i+1) + ": Actual = " + result + ", Expected = " + expected[i]);
    }
}