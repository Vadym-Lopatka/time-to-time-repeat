package com.company.algos.twoPoints.linkedList;

public class RemoveNthElFromTheEnd {

    public static void main(String[] args) {
        var head = new LinkedNode(new int[]{1,2,3,4,5});
        System.out.println(head);
        System.out.println(removeNthFromEnd(head, 1));
    }

    private static LinkedNode removeNthFromEnd(LinkedNode head, int n) {
        LinkedNode dummy = new LinkedNode(0);
        dummy.next = head;
        LinkedNode first = dummy;
        LinkedNode second = dummy;

        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }

}
