package Trees;

public class LowestCommonAncestor {

    // Optimized BST Recursive Solution
    public static int findLCA(Node root,
                              int p,
                              int q){

        // both on left side
        if (p < root.data &&
                q < root.data){

            return findLCA(root.left, p, q);
        }

        // both on right side
        if (p > root.data &&
                q > root.data){

            return findLCA(root.right, p, q);
        }

        // split occurs OR current is p/q
        return root.data;
    }


    public static void main(String[] args) {

        BinarySearchTree tree =
                new BinarySearchTree();

        tree.insert(new Node(6));
        tree.insert(new Node(2));
        tree.insert(new Node(8));
        tree.insert(new Node(0));
        tree.insert(new Node(4));
        tree.insert(new Node(7));
        tree.insert(new Node(9));
        tree.insert(new Node(3));
        tree.insert(new Node(5));

        System.out.println(
                findLCA(tree.root, 2, 8)
        );

        System.out.println(
                findLCA(tree.root, 2, 4)
        );
    }
}