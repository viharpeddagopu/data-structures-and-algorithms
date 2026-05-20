package Trees;

import java.util.Stack;

public class KthSmallestElementInBST {

    public static int kthSmallest(Node root,
                                  int k){

        Stack<Node> stack =
                new Stack<>();

        Node current = root;

        while (current != null ||
                !stack.isEmpty()){

            // go fully left
            while (current != null){

                stack.push(current);

                current = current.left;
            }

            // process current smallest
            current = stack.pop();

            k--;

            // kth smallest found
            if (k == 0)
                return current.data;

            // move to right subtree
            current = current.right;
        }

        return -1;
    }

    public static void main(String[] args) {

        BinarySearchTree tree =
                new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(2));
        tree.insert(new Node(4));
        tree.insert(new Node(1));

        System.out.println(
                kthSmallest(tree.root, 3)
        );
    }
}