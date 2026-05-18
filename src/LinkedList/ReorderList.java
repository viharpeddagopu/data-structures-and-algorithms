package LinkedList;

import LinkedList.LinkedListImplementation.Node;

public class ReorderList {

    public static void reorderList(Node head) {

        if (head == null || head.next == null) {
            return;
        }

        // find middle using slow-fast pointers
        Node slow = head;
        Node fast = head;

        while (fast.next != null &&
                fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        Node current = slow.next;
        Node prev = null;

        while (current != null) {

            Node next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        // split list
        slow.next = null;

        // merge two halves
        Node first = head;
        Node second = prev;

        while (second != null) {

            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    // print list
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        reorderList(head);

        System.out.println("Reordered List:");
        printList(head);
    }
}