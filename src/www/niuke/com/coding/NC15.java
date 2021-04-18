package www.niuke.com.coding;

import www.niuke.com.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liyuan zheng
 * @date 2021/03/16 23:10
 * 二叉树的层次遍历
 */
public class NC15 {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if(temp.left !=null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
