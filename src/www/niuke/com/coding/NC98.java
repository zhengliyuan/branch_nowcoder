package www.niuke.com.coding;

import www.niuke.com.base.TreeNode;

/**
 * 给定彼此独立的两棵二叉树，判断 t1 树是否有与 t2 树拓扑结构完全相同的子树。
 * 设 t1 树的边集为 E1，t2 树的边集为 E2，若 E2 等于 E1 ，则表示 t1 树和t2 树的拓扑结构完全相同。
 */
public class NC98 {
    public boolean isContains (TreeNode root1, TreeNode root2) {
        // write code here
        if(root1 == null){
            return false;
        }
        if(isSame(root1,root2)){
            return true;
        }
        return isContains(root1.left,root2) || isContains(root1.right,root2);
    }

    public boolean isSame(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val == root2.val){
            return isSame(root1.left,root2.left) && isSame(root1.right,root2.right);
        }
        return false;
    }
}
