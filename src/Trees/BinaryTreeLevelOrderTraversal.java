package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>>
    levelOrderBFSTraversal(Node root){

        List<List<Integer>> result =
                new ArrayList<>();

        if (root == null)
            return result;

        Queue<Node> q =
                new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()){

            int queueSize = q.size();

            List<Integer> level =
                    new ArrayList<>();

            // process current level
            for (int i = 0;
                 i < queueSize;
                 i++){

                Node current = q.poll();

                level.add(current.data);

                // add left child
                if (current.left != null)
                    q.offer(current.left);

                // add right child
                if (current.right != null)
                    q.offer(current.right);
            }

            result.add(level);
        }

        return result;
    }

    public static void main(String[] args) {

        Node root = new Node(3);

        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(
                levelOrderBFSTraversal(root)
        );
    }
}