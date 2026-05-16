package LinkedList;

import LinkedList.LinkedListImplementation.Node;

import java.util.HashSet;

public class LinkedListCycle {

    // detect cycle using HashSet
    public static boolean hasCycle(Node head) {

        HashSet<Node> visited = new HashSet<>();

        Node current = head;

        while (current != null) {

            // cycle detected
            if (visited.contains(current)) {
                return true;
            }

            visited.add(current);

            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // create cycle
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }
}