/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null) return true;
        String sub = preOrder(subRoot);
        String p = preOrder(root);
        return p.contains(sub);
    }

    public String preOrder(TreeNode root){
        if(root==null) return "null";
        StringBuilder sb = new StringBuilder("*");
        sb.append(root.val);
        sb.append(preOrder(root.left));
        sb.append(preOrder(root.right));
        return sb.toString();
    }
}
