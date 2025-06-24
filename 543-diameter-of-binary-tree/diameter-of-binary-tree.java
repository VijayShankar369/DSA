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
    private int maxDepth = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDepth;
    }


    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        maxDepth = Math.max(maxDepth,leftDepth+rightDepth);

        return Math.max(leftDepth,rightDepth)+1;
    }
}