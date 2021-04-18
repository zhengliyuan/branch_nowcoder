package www.niuke.com.coding;


import www.niuke.com.base.TreeNode;

/**
 * 给定一个二叉树，请计算节点值之和最大的路径的节点值之和是多少。
 * 这个路径的开始节点和结束节点可以是二叉树中的任意节点
 * @Date 2021年3月7日17:14:13
 */
public class NC6 {
    public int res = Integer.MIN_VALUE;
    public int maxPathSum (TreeNode root) {
        // write code here
        getMax(root);
        return res;
    }


    public int getMax(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftMax = Math.max(0,getMax(root.left));
        int rightMax = Math.max(0,getMax(root.right));
        res = Math.max(res,Math.max(root.val+Math.max(leftMax,rightMax),root.val+leftMax+rightMax));
        return Math.max(leftMax,rightMax)+root.val;
    }
}
