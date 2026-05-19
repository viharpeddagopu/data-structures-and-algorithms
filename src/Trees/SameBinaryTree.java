package Trees;

public class SameBinaryTree {
    public static boolean treeCheck(Node root1, Node root2){
        //both null
        if (root1 == null && root2 == null)
            return true;

        //one null
        if(root1 == null || root2 == null)
            return false;

        //both different
        if (root1.data != root2.data)
            return false;

        //recursive compare
        return treeCheck(root1.left, root2.left) && treeCheck(root1.right, root2.right);
    }

    public static void main(String[] args) {

        BinarySearchTree tree1 =
                new BinarySearchTree();

        tree1.insert(new Node(4));
        tree1.insert(new Node(2));
        tree1.insert(new Node(6));

        BinarySearchTree tree2 =
                new BinarySearchTree();

        tree2.insert(new Node(4));
        tree2.insert(new Node(2));
        tree2.insert(new Node(6));

        System.out.println(
                treeCheck(tree1.root,
                        tree2.root)
        );
    }
}
