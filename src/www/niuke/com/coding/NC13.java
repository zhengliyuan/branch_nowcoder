package www.niuke.com.coding;

import www.niuke.com.base.TreeNode;

/**
 * 求给定二叉树的最大深度，
 * 最大深度是指树的根结点到最远叶子结点的最长路径上结点的数量。
 * @Date 2021年3月14日18:22:01
 */
public class NC13 {
    public int maxDepth (TreeNode root) {
        // write code here
        return postOrder(root);
    }

    public int postOrder(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = 1 + postOrder(root.left);
        int right = 1+ postOrder(root.right);
        return left>right?left:right;
    }
}
