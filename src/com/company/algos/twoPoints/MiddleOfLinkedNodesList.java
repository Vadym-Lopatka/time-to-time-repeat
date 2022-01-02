package com.company.algos.twoPoints;

public class MiddleOfLinkedNodesList {
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


    static class LinkedNode {
        int val;
        LinkedNode next;

        LinkedNode() {
        }

        LinkedNode(int[] ints) {
            this.val = ints[0];
            LinkedNode current = this;
            for (int i = 1; i < ints.length; i++) {
                LinkedNode node = new LinkedNode(ints[i]);
                current.next = node;
                current = node;
            }
        }

        LinkedNode(int val) {
            this.val = val;
        }

        LinkedNode(int val, LinkedNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
