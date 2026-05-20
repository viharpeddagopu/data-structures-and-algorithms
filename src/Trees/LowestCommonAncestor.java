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


    /*
    ------------------------------------------------
    Naive Solution (General Binary Tree Approach)
    ------------------------------------------------

    public static Node findLCA(Node root,
                               Node p,
                               Node q){

        // base case
        if (root == null ||
                root == p ||
                root == q){

            return root;
        }

        // search both subtrees
        Node left =
                findLCA(root.left, p, q);

        Node right =
                findLCA(root.right, p, q);

        // both non-null => current is LCA
        if (left != null &&
                right != null){

            return root;
        }

        // return whichever side found node
        return (left != null)
                ? left
                : right;
    }

    */


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