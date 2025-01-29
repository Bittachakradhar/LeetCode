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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res=new ArrayList<>();
        dfs(root,res);
        return res;

    }
    public void dfs(TreeNode node,List<Integer> res){
        if(node==null)return;

        res.add(node.val);
        // call1 lc
        dfs(node.left,res);
        // call2 rc
        dfs(node.right,res);

    }
}