package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TraverseTree {

    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }

        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){

            TreeNode node = queue.poll();
            final TreeNode left = node.left;

            node.left = node.right;
            node.right = left;

            if(node.left != null){
                queue.offer(node.left);
            }

            if(node.right != null){
                queue.offer(node.right);
            }
        }

        return root;
    }
}
