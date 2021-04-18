package www.niuke.com.coding;

import www.niuke.com.base.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个二叉树和一个值\ sum sum，判断是否有从根节点到叶子节点的节点值之和等于\ sum sum 的路径，
 * 例如：
 * 给出如下的二叉树，\ sum=22 sum=22
 * @Data 2021年3月7日22:16:03
 */
public class NC9 {
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        return dfs(root,sum,0);
    }

    public boolean dfs(TreeNode root,int sum,int cnt){
        if (root == null){
            return false;
        }
        cnt += root.val;
        if(root.left == null && root.right == null){
            if(cnt == sum){
                return true;
            }
        }
        return dfs(root.left,sum,cnt) || dfs(root.right,sum,cnt);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 1;
        TreeNode rootLeft = new TreeNode();
        rootLeft.val = 2;
        root.left = rootLeft;
        NC9 nc9 = new NC9();
        nc9.hasPathSum(root,3);
        Map<String,Object> map = new HashMap<>();
    }
}
