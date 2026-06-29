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
//Great — this is a **classic interview follow-up**.
//The interviewer asks:
//
//        > Can you check if a linked list is a palindrome **without reversing it**?
//
//The common answer uses **recursion**.
//
//But it’s important to understand **how recursion simulates moving from both ends**.
//
//        ---
//
//        # Core Idea
//
//A singly linked list cannot move backward.
//
//But recursion uses the **call stack** to reach the end of the list and then come back.
//
//So we can compare:
//
//        ```
//first node  ↔ last node
//second node ↔ second last node
//...
//        ```
//
//exactly like a palindrome check.
//
//---
//
//        # Visual Example
//
//List:
//
//        ```text
//1 → 2 → 3 → 2 → 1
//        ```
//
//We use two pointers:
//
//        ```
//left  → head
//right → recursion pointer
//```
//
//        ---
//
//        # Step 1 — Go to the End with Recursion
//
//Call stack builds like this:
//
//        ```
//check(1)
//check(2)
//check(3)
//check(2)
//check(1)
//check(null)
//```
//
//Now recursion **starts returning upward**.
//
//        ---
//
//        # Step 2 — Compare While Returning
//
//Stack unwinds:
//
//        ### Compare last and first
//
//```
//left = 1
//right = 1
//        ```
//
//Move left forward.
//
//```
//left → 2
//        ```
//
//        ---
//
//        ### Compare second last and second
//
//```
//left = 2
//right = 2
//        ```
//
//Move left forward.
//
//```
//left → 3
//        ```
//
//        ---
//
//        ### Compare middle
//
//```
//left = 3
//right = 3
//        ```
//
//Still valid.
//
//Continue until stack ends.
//
//        ---
//
//        # Java Implementation
//
//```java
//class Solution {
//
//    ListNode left;
//
//    public boolean isPalindrome(ListNode head) {
//        left = head;
//        return check(head);
//    }
//
//    private boolean check(ListNode right) {
//
//        if (right == null) {
//            return true;
//        }
//
//        boolean result = check(right.next);
//        if (!result) return false;
//
//        if (left.val != right.val) {
//            return false;
//        }
//
//        left = left.next;
//
//        return true;
//    }
//}
//```
//
//        ---
//
//        # Why This Works
//
//The recursion moves `right` to the end.
//
//When the stack unwinds:
//
//        ```
//left pointer moves forward
//right pointer moves backward
//```
//
//So we compare symmetric nodes.
//
//---
//
//        # Complexity
//
//Time:
//
//        ```
//O(n)
//```
//
//Space:
//
//        ```
//O(n)  (recursion stack)
//        ```
//
//        ---
//
//        # Comparison with the Reverse Method
//
//| Method              | Time | Space | Modifies List |
//        | ------------------- | ---- | ----- | ------------- |
//        | Reverse second half | O(n) | O(1)  | Yes           |
//        | Recursion           | O(n) | O(n)  | No            |
//
//In interviews:
//
//        * Reverse method → **better space**
//        * Recursion → **cleaner conceptually**
//
//        ---
//
//        # Important Insight
//
//This technique works because recursion provides **implicit backward traversal**.
//
//You cannot normally move backward in a singly linked list.
//
//        ---
//
//        # One Trick Interviewers Like to Ask
//
//Suppose the list has **10 million nodes**.
//
//Which solution is safer?
//
//        * Reverse method
//* Recursive method
//
//Think about **stack overflow**.
