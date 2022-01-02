package com.company.algos.twoPoints.linkedList;

public class ReturnMiddle {
    // return the middle element of the linked list {1 2 3 4 5} => 3
    // If there are two middle nodes, return the second middle node. {1 2 3 4 5 6} => 4

    public static void main(String[] args) {

        var head = new LinkedNode(new int[]{1, 2, 3, 4, 5});

        LinkedNode middle = defineMiddle(head);
        System.out.println(middle.val == 3);

    }

    private static LinkedNode defineMiddle(LinkedNode head) {
        // the main idea is the fast pointer moves twice faster than slow pointer
        // and when fast reaches the end - slow will be on the middle element
        // time O(n), space O(1)

        LinkedNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
