package edu.otc;

public class LinkedList {
    public LLNode headNode = null;

    public void add(int value) {
        LLNode temp = new LLNode(value);
        temp.next = headNode;
        headNode = temp;
    }

    public void printList() {
        if (headNode == null)
            return;

        LLNode temp = headNode;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
