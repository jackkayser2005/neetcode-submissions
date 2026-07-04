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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>(); 
        Queue<TreeNode> queue = new LinkedList<>(); 
        if(root == null) {
            return res; 
        }

        queue.offer(root); 

        while(!queue.isEmpty()) {
            int listSize = queue.size(); 
            List<Integer> value = new ArrayList<>(listSize); 
            for(int i = 0; i < listSize; i++) { 
                TreeNode temp = queue.poll(); 
                value.add(temp.val); 

                if(temp.left != null) {
                    queue.offer(temp.left); 
                }
                if(temp.right !=null) { 
                    queue.offer(temp.right); 
                }
            }
            res.add(value); 
        }
        return res; 
    }
}
