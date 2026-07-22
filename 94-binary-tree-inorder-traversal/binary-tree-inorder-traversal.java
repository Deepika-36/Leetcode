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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        ineorder(root,res);
        return res;
    }

    private void ineorder(TreeNode node, List<Integer> res){
        if(node==null)
        return ;

        
        ineorder(node.left,res);
        res.add(node.val);
        ineorder(node.right, res);
    }
}