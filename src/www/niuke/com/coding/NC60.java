package www.niuke.com.coding;

import www.niuke.com.base.TreeNode;

/**
 * 给定一棵二叉树，已经其中没有重复值的节点，请判断该二叉树是否为搜索二叉树和完全二叉树。
 */
public class NC60 {
    /**
     *
     * @param root TreeNode类 the root
     * @return bool布尔型一维数组
     */
    public boolean[] judgeIt (TreeNode root) {
        // write code here
        boolean[] res = new boolean[]{false,false};
        if(root == null){
            return res;
        }
        return res;
    }

    /**
     * 判断二叉搜索树
     * @param root
     * @return
     */
    public boolean judgetTree(TreeNode root){
        return false;
    }

    /**
     * 判断完全二叉树
     * @param root
     * @return
     */
    public boolean judgeAllTree(TreeNode root){
        return false;
    }
}
