package LinkedList;

public class ReverseLinkedList {

    // Node class
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // reverse linked list
    public Node reverseList() {

        Node prev = null;
        Node current = head;

        while (current != null) {

            // store next node
            Node next = current.next;

            // reverse pointer
            current.next = prev;

            // move pointers
            prev = current;
            current = next;
        }

        head = prev;

        return head;
    }

    // print linked list
    public void printList() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ReverseLinkedList list =
                new ReverseLinkedList();

        // create list
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original List:");
        list.printList();

        list.reverseList();

        System.out.println("Reversed List:");
        list.printList();
    }
}