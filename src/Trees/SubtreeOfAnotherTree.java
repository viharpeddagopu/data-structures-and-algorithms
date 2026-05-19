package Trees;

import static Trees.SameBinaryTree.treeCheck;

public class SubtreeOfAnotherTree {
    // subtree check
    public static boolean subtreePresent(Node root,
                                         Node subRoot){

        // empty subtree always exists
        if (subRoot == null)
            return true;

        // main tree exhausted
        if (root == null)
            return false;

        // subtree found
        if (treeCheck(root, subRoot))
            return true;

        // continue searching
        return subtreePresent(root.left,
                subRoot)

                ||

                subtreePresent(root.right,
                        subRoot);
    }

    public static void main(String[] args) {

        Node root = new Node(3);

        root.left = new Node(4);
        root.right = new Node(5);

        root.left.left = new Node(1);
        root.left.right = new Node(2);

        Node subRoot = new Node(4);

        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        System.out.println(
                subtreePresent(root, subRoot)
        );
    }
}
