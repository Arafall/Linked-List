package edu.otc;

/**
 * Create a Linked List and add several nodes to be removed later.
 * Displays the list after each deletion as it updates.
 * @author Daniel Wade
 */
public class Main {
    public static void main(String[] args) {
        // Instantiate Linked List to view nodes.
        LinkedList ll = new LinkedList();
        // Add three different nodes to delete over time.
        ll.add("candy");
        ll.add("pizza");
        ll.add("sandwich");
        // Loop for each node deleting it from the list after displaying its node information.
        for (var i = 0; i < 4; i++) {
            showList(ll);
            ll.delete();
        }
    }

    /**
     * Using a specified Linked List display if certain data exists in the nodes.
     * @param ll Linked List object passed through to access its nodes for displaying.
     */
    public static void showList(LinkedList ll) {
        System.out.println("-Linked List Items-");
        ll.printList();
        System.out.println("-------------------");
        System.out.println("Contains sandwich " + (ll.search("sandwich") != null));
        System.out.println("Contains pizza: " + (ll.search("pizza") != null));
        System.out.println("Contains candy: " + (ll.search("candy") != null));
        System.out.println();

    }
}