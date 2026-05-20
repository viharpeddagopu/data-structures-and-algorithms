package Trees;

public class ValidateBinarySearchTree {

    public static boolean isValidBST(Node root){

        return validate(root,
                Long.MIN_VALUE,
                Long.MAX_VALUE);
    }

    private static boolean validate(Node root,
                                    long min,
                                    long max){

        // empty tree is valid
        if (root == null)
            return true;

        // current node violates BST rule
        if (root.data <= min ||
                root.data >= max)
            return false;

        // recursively validate subtrees
        return validate(root.left,
                min,
                root.data)

                &&

                validate(root.right,
                        root.data,
                        max);
    }

    public static void main(String[] args) {

        Node root = new Node(5);

        root.left = new Node(1);

        root.right = new Node(7);

        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println(
                isValidBST(root)
        );
    }
}