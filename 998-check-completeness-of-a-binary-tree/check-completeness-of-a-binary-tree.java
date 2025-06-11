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


//In level-order traversal, once you hit the first null, everything after must also be null — or the tree is not complete.
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);

        while(bfs.peek() != null){
            TreeNode node = bfs.poll();
            bfs.offer(node.left);
            bfs.offer(node.right);
        }

        while(!bfs.isEmpty() && bfs.peek() == null){
            bfs.poll();
        }

        return bfs.isEmpty();
    }
}