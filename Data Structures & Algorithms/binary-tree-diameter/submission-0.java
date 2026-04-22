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

    public int diameterOfBinaryTree(TreeNode root) {
        return getDiameter(root).dia;
    }

    public Diameter getDiameter(TreeNode root){
        if(root==null) return new Diameter();
        Diameter left = getDiameter(root.left);
        Diameter right = getDiameter(root.right);
        Diameter self = new Diameter();
        int diameter = left.height+right.height;
        self.dia=Math.max(diameter, Math.max(left.dia,right.dia));
        self.height=Math.max(left.height, right.height)+1;
        return self;
    }
}

class Diameter{
    int dia=0;
    int height=0;
}
