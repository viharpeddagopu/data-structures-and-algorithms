package Trees;

public class MaximumDepthOfBinaryTree {

    public static int treeDepth(Node root){

        // base case
        if (root == null)
            return 0;

        return 1 + Math.max(
                treeDepth(root.left),
                treeDepth(root.right)
        );
    }

    public static void main(String[] args) {

        BinarySearchTree tree =
                new BinarySearchTree();

        tree.insert(new Node(4));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(1));
        tree.insert(new Node(3));

        System.out.println(
                treeDepth(tree.root)
        );
    }
}