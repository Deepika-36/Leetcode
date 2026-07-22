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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        posteorder(root,res);
        return res;
    }
    private void posteorder(TreeNode node, List<Integer> res){
        if(node==null)
        return ;
        
        posteorder(node.left,res);       
        posteorder(node.right, res);
         res.add(node.val);
    }
}