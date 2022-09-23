package com.leetcode;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("{");
        buffer.append(val);
        while (next != null) {
            if (next != null) {
                buffer.append("," + next.val);
            }
            next = next.next;

        }
        buffer.append("}");
        return buffer.toString();
    }
}
