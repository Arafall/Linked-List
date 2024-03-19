package edu.otc;

/**
 * Linked List class
 * @author Daniel Wade
 */
public class LinkedList {
    // Latest node to be added into linked list.
    public LLNode headNode = null;

    /**
     * Creates a new node and assigns its next node as the current head,
     * then set that new node as the head node.
     * @param value String that'll be assigned to the new node's data property.
     */
    public void add(String value) {
        // Instantiate new node.
        LLNode temp = new LLNode(value);
        // Assign its next node as the previous head.
        temp.next = headNode;
        // Set new head node to be the one created.
        headNode = temp;
    }

    /**
     * Nullifies the head node to delete it from the linked list, leaving it for garbage collection.
     */
    public void delete() {
        // Leave method when head is doesn't exist/list is empty.
        if (headNode == null) return;
        // Nullify node when it's the only node.
        if (headNode.next == null)
            headNode = null;
        // Set head node to the next one in the list, essentially ejecting the object.
        else
            headNode = headNode.next;
    }

    /**
     * Loops through each node in the linked list until a specified string is found.
     * If string wasn't found then it returns null instead.
     * @param valToFind String value to find in the linked list.
     * @return Node object that contains the string specified in the data property.
     */
    public LLNode search(String valToFind) {
        // Assign a tracker value for the original head node as to
        // not change the link list head property.
        LLNode temp = headNode;
        // Loop through nodes until string is found.
        while (temp != null) {
            // Return node containing the string.
            if (valToFind.equals(temp.data))
                return temp;

            temp = temp.next;
        }
        // Return null if node wasn't found.
        return null;
    }

    /**
     * For each node object that isn't null print out each of their data property.
     */
    public void printList() {
        // Leave method when head is doesn't exist/list is empty.
        if (headNode == null) return;
        // Assign a tracker value for the original head node as to
        // not change the link list head property.
        LLNode temp = headNode;
        // Loop through each node printing its data property while
        // traversing to the next node it references.
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
