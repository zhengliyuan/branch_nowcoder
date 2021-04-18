package www.niuke.com.coding;


import www.niuke.com.base.TreeNode;

/**
 * 给定一个仅包含数字\ 0-9 0−9 的二叉树，每一条从根节点到叶子节点的路径都可以用一个数字表示。
 * 例如根节点到叶子节点的一条路径是1\to 2\to 31→2→3,那么这条路径就用\ 123 123 来代替。
 * 找出根节点到叶子节点的所有路径表示的数字之和
 */
public class NC5 {
    public int sumNumbers (TreeNode root) {
        // write code here
        int sum = 0;
        if(root == null){
            return sum;
        }
        return dfs(root,sum);
    }

    public int dfs(TreeNode root,int num){
        if(root == null){
            return 0;
        }
        num = num*10+root.val;
        if(root.left == null && root.right == null){
            return num;
        }
        return dfs(root.left,num)+dfs(root.right,num);
    }
}
