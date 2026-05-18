package LinkedList;

import LinkedList.LinkedListImplementation.Node;

public class RemoveNthNodeFromEndOfList {

    public static Node removeNthNode(Node head, int n) {

        Node dummy = new Node(-1);
        dummy.next = head;

        Node left = dummy;
        Node right = dummy;

        // move right pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            right = right.next;
        }

        // move both pointers
        while (right != null) {

            left = left.next;
            right = right.next;
        }

        // remove nth node
        left.next = left.next.next;

        return dummy.next;
    }

    // print linked list
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

        head = removeNthNode(head, 2);

        System.out.println("After Removing 2nd Node From End:");
        printList(head);
    }
}