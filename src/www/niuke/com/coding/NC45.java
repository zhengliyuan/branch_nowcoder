package www.niuke.com.coding;

import www.niuke.com.base.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liyuan zheng
 * @date 2020/12/9 21:24
 * 二叉树的先序、中序和后序
 */
public class NC45 {
    public int[][] threeOrders (TreeNode root) {
        // write code here
        int size = levelOrders(root).size();
        int[][] res = new int[3][size];
        if(root == null){
            return res;
        }
        ArrayList<Integer> preList = new ArrayList<>();
        ArrayList<Integer> midList = new ArrayList<>();
        ArrayList<Integer> lastList = new ArrayList<>();
        preOrders(root,preList);
        midOrders(root,midList);
        lastOrders(root,lastList);
        for(int i=0;i<size;i++){
            res[0][i] = preList.get(i);
            res[1][i] = midList.get(i);
            res[2][i] = lastList.get(i);
        }
        return res;
    }

    //先序遍历，递归
    public void preOrders(TreeNode root, ArrayList<Integer> a){
        a.add(root.val);
        if(root.left != null){
            preOrders(root.left,a);
        }
        if(root.right != null){
            preOrders(root.right,a);
        }
    }
    //中序遍历，递归
    public void midOrders(TreeNode root, ArrayList<Integer> a){
        if(root.left != null){
            midOrders(root.left,a);
        }
        a.add(root.val);
        if(root.right != null){
            midOrders(root.right,a);
        }
    }
    //后序遍历，递归
    public void lastOrders(TreeNode root, ArrayList<Integer> a){
        if(root.left != null){
            lastOrders(root.left,a);
        }
        if(root.right != null){
            lastOrders(root.right,a);
        }
        a.add(root.val);
    }

    //层次遍历,非递归
    public ArrayList<Integer> levelOrders(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            list.add(currentNode.val);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return list;
    }
    //获取树中所有结点数，递归
    public int getTreeNodeSizeRec(TreeNode root){
        //层次遍历
        int res = 0;
        return res;
    }
    //获取树中所有结点数，非递归
    public int getTreeNodeSizeNoRec(TreeNode root){
        //层次遍历
        int res = 0;
        return res;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode();
        t1.val =1;
        TreeNode t2 = new TreeNode();
        t1.val =2;
        TreeNode t5 = new TreeNode();
        t1.val =5;
        t5.left = t1;
        t5.right = t2;
        TreeNode t11 = new TreeNode();
        t1.val =11;
        TreeNode t8 = new TreeNode();
        t1.val =8;
        TreeNode t9 = new TreeNode();
        t1.val =9;
        t11.left = t8;
        t11.right = t9;
        TreeNode t44 = new TreeNode();
        t1.val =44;
        TreeNode t18 = new TreeNode();
        t1.val =18;
        TreeNode t10 = new TreeNode();
        t1.val =10;
        t18.right = t5;
        t10.left = t11;
        t44.left = t18;
        t44.right = t10;
        ArrayList list = new ArrayList();
        NC45 nc45 = new NC45();
        nc45.midOrders(t44,list);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
