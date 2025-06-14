/**Tree */
class Solution {
    public int countNodes(TreeNode root) {
        int leftDepth = leftDepth(root);
        int rightDepth = rightDepth(root);

        if(leftDepth == rightDepth){
            return (int) Math.pow(2,leftDepth)-1;
        }
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
    private int leftDepth(TreeNode node){
        int depth = 0;
        while(node != null){
            node = node.left;
            depth++;
        }
        return depth;
    }
    private int rightDepth(TreeNode node){
        int depth = 0;
        while(node != null){
            node = node.right;
            depth++;
        }
        return depth;
    }
}