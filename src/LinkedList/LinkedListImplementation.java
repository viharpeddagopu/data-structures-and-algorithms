package LinkedList;

public class LinkedListImplementation {
    //node class
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //head of the list
    Node head;

    //insert at the end
    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    //insert at beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    //delete by value
    public void deleteByValue(int data){
        if (head == null) {
            return;
        }

        if (head.data == data){
            head.next = head;
            return;
        }

        Node temp = head;

        while(temp.next!=null && temp.next.data!=data)
            temp = temp.next;

        if (temp.next == null)
            return;

        temp.next = temp.next.next;
    }

    //search element
    public boolean findElement(int data){
        Node temp = head;

        while(temp != null){
            if (temp.data == data)
                return true;

            temp = temp.next;
        }
        return false;
    }

    //print linked list
    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data + "->");

            temp = temp.next;
        }
        System.out.println("null");
    }
}
