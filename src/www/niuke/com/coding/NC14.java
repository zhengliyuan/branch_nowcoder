package www.niuke.com.coding;

import www.niuke.com.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
 * @Date 2021年3月15日
 */
public class NC14 {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> res = new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(flag){
                    res.add(temp.val);
                }else{
                    res.add(0,temp.val);
                }
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            flag = !flag;
            list.add(res);
        }
        return list;
    }
}
