package www.niuke.com.coding;


import www.niuke.com.base.TreeNode;

/**
 * 给出一个升序排序的数组，将其转化为平衡二叉搜索树（BST）
 * @Date 2021年3月9日23:12:49
 */
public class NC11 {
    public TreeNode sortedArrayToBST (int[] num) {
        // write code here
        TreeNode root = new TreeNode();
        if(num == null){
            return null;
        }
        return helper(num,0,num.length-1);
    }

    public TreeNode helper(int[] num,int left,int right){
        if(left>right){
            return null;
        }
        int mid = left + (right - left + 1)/2 -1;
        TreeNode lNode = helper(num,left,mid-1);
        TreeNode rNode = helper(num,mid+1,right);
        TreeNode node = new TreeNode();
        node.val = num[mid];
        if(lNode != null){
            node.left = lNode;
        }
        if(rNode != null){
            node.right = rNode;
        }
        return node;
    }
}
