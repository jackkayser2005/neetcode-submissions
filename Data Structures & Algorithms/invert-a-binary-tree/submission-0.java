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
    public TreeNode invertTree(TreeNode root) {
        TreeNode res = root;
        Queue<TreeNode> queue = new LinkedList<>(); 

        if(root == null) {
            return null; 
        } 
        queue.offer(root); //so in that is the queu top now nothign needs to change 

        while(!queue.isEmpty()) {
            int levelSize = queue.size(); 
            
            for(int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll(); 
                TreeNode temp = node.left; 
                node.left = node.right; 
                node.right = temp; 
                if(node.left !=null) {
                    queue.offer(node.left);      
                }
                if(node.right !=null) {
                    queue.offer(node.right);  
                }
            }

        }

     return root; 
    }
   
}
