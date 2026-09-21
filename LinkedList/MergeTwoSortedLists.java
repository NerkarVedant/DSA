/**
 * Definition for singly-linked list.
 **/

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next = list2;
                list2 = list2.next;
            }
            current=current.next;
        }
        if(list1 != null) current.next=list1;
        if(list2 != null) current.next=list2;

        return head.next;


    }
}



void main() {
    Solution sol = new Solution();

    // Test 1: Basic merge - [1,2,4] + [1,3,4]  Expected: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode r1 = sol.mergeTwoLists(l1, l2);
    while (r1 != null) { System.out.print(r1.val + (r1.next != null ? " -> " : "")); r1 = r1.next; }
    System.out.println();

    // Test 2: Both null  Expected: []
    ListNode r2 = sol.mergeTwoLists(null, null);
    System.out.println(r2 == null ? "[]" : r2.val);

    // Test 3: One empty - [] + [0]  Expected: 0
    ListNode r3 = sol.mergeTwoLists(null, new ListNode(0));
    System.out.println(r3.val);

    // Test 4: Different lengths - [1,3,5] + [2,4]  Expected: 1 -> 2 -> 3 -> 4 -> 5
    ListNode l4a = new ListNode(1, new ListNode(3, new ListNode(5)));
    ListNode l4b = new ListNode(2, new ListNode(4));
    ListNode r4 = sol.mergeTwoLists(l4a, l4b);
    while (r4 != null) { System.out.print(r4.val + (r4.next != null ? " -> " : "")); r4 = r4.next; }
    System.out.println();
}