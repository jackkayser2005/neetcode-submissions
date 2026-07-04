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
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter; 
    }

    private int dfs(TreeNode root) {
        if(root == null) return 0; 
        int leftDiameter = dfs(root.left); 
        int rightDiameter = dfs(root.right); 
         maxDiameter = Math.max(maxDiameter, leftDiameter + rightDiameter);

         return 1 + Math.max(leftDiameter, rightDiameter); 



        


    }
}
