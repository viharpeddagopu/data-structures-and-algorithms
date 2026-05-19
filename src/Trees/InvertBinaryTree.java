package Trees;

public class InvertBinaryTree {

    public static void invertTree(Node root){

        // base case
        if (root == null)
            return;

        // swap children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recursively invert subtrees
        invertTree(root.left);
        invertTree(root.right);

        return;
    }

    public static void main(String[] args) {

        BinarySearchTree tree =
                new BinarySearchTree();

        tree.insert(new Node(4));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(1));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(9));

        System.out.println("Before inversion:");
        tree.display();

        invertTree(tree.root);

        System.out.println("\nAfter inversion:");
        tree.display();
    }
}