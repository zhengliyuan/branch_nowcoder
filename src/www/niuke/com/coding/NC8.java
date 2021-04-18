package www.niuke.com.coding;

import www.niuke.com.base.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 给定一个二叉树和一个值\ sum sum，请找出所有的根节点到叶子节点的节点值之和等于\ sum sum 的路径，
 * @Data 2021年3月7日22:08:41
 */
public class NC8 {

    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> temp = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        dfs(root,sum,0);
        return res;
    }

    public void dfs(TreeNode root,int sum,int cnt){
        if (root == null){
            return;
        }
        temp.add(root.val);
        cnt += root.val;
        if(root.left == null && root.right == null){
            if(cnt == sum){
                res.add(new ArrayList<>(temp));
            }
        }else{
            dfs(root.left,sum,cnt);
            dfs(root.right,sum,cnt);
        }
        temp.remove(temp.size()-1);

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        NC8 nc8 = new NC8();
        nc8.pathSum(treeNode,1);
    }
}
