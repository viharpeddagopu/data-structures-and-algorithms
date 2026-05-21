package Trees;

import java.util.HashMap;

public class ConstructBinaryTree {

    static int preorderIndex = 0;

    public static Node buildTree(int[] preorder,
                                 int[] inorder){

        HashMap<Integer, Integer> inorderMap =
                new HashMap<>();

        // store inorder indices
        for (int i = 0;
             i < inorder.length;
             i++){

            inorderMap.put(inorder[i], i);
        }

        return build(preorder,
                0,
                inorder.length - 1,
                inorderMap);
    }

    private static Node build(int[] preorder,
                              int left,
                              int right,
                              HashMap<Integer,
                                      Integer> inorderMap){

        // subtree exhausted
        if (left > right)
            return null;

        // current root from preorder
        int rootValue =
                preorder[preorderIndex++];

        Node root =
                new Node(rootValue);

        // root index in inorder
        int mid =
                inorderMap.get(rootValue);

        // build left subtree
        root.left =
                build(preorder,
                        left,
                        mid - 1,
                        inorderMap);

        // build right subtree
        root.right =
                build(preorder,
                        mid + 1,
                        right,
                        inorderMap);

        return root;
    }

    // inorder print
    public static void display(Node root){

        if (root != null){

            display(root.left);

            System.out.print(
                    root.data + " "
            );

            display(root.right);
        }
    }

    public static void main(String[] args) {

        int[] preorder =
                {3,9,20,15,7};

        int[] inorder =
                {9,3,15,20,7};

        Node root =
                buildTree(preorder,
                        inorder);

        display(root);
    }
}