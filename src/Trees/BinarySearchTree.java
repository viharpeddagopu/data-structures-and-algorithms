package Trees;

public class BinarySearchTree {
     Node root;

    //inserting a node
     public void insert(Node node){
         root = insertHelper(root, node);
     }

     private Node insertHelper(Node root, Node node){
         int data = node.data;

         if (root == null){
             root = node;
             return root;
         } else if (data < root.data) {
             root.left = insertHelper(root.left, node);
         }else {
             root.right = insertHelper(root.right, node);
         }
         return root;
     }

     //displaying a node
    public void display(){
         displayHelper(root);
    }

    private void displayHelper(Node root){
         //ascending order
         if (root != null){
             displayHelper(root.left);
             System.out.println(root.data);
             displayHelper(root.right);
         }
    }

    //search for data
    public boolean search(int data){
         return searchHelper(root, data);
    }

    private boolean searchHelper(Node node, int data){
         if (root == null)
             return false;
         else if (root.data == data) {
             return true;
         }
         else if (root.data > data) {
             return searchHelper(root.left, data);
         }
         else
             return searchHelper(root.right, data);
    }

    //remove
    public void remove(int data){
         if (search(data))
             removeHelper(root, data);
         else
             System.out.println("data not found");
    }
    private Node removeHelper(Node root, int data){
         if (root == null)
             return root;
         else if (data < root.data)
             root.left = removeHelper(root.left, data);
         else if (data > root.data)
             root.right = removeHelper(root.right, data);
         else { //node found
             if (root.left == null && root.right == null) //leaf node
                 root = null;
             else if (root.right != null){
                 root.data = successor(root); //replace the root with right child
                 root.right = removeHelper(root.right, root.data); //delete the right child
             }
             else {
                 root.data = predecessor(root);
                 root.left = removeHelper(root.left, root.data);
             }
         }
         return root;
    }

    private int successor(Node root){ //find the least value below the right child of this root node
         root = root.right;
         while (root.left != null)
             root = root.left;

         return root.data;
    }

    private int predecessor(Node root){ //find the greatest value below the left child of this root node
        root = root.left;
        while (root.right != null)
            root = root.right;

        return root.data;
    }
}
