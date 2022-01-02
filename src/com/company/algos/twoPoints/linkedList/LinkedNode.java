package com.company.algos.twoPoints.linkedList;

public class LinkedNode {
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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        LinkedNode next=this;
        while (next != null) {
            result.append(next.val);
            result.append(",");

            next = next.next;
        }
        result.append("}");
        return result.toString();
    }
}
