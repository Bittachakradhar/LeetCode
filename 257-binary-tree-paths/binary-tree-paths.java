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
    List<String> res=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"");
        return res;
    }
    public void dfs(TreeNode node,String path){
        if(node==null){
            // res.add(path);
            return;
        }
        if(node.left == null && node.right == null){
            res.add(path + node.val);
            return;
        }
        dfs(node.left,path + node.val+"->");
        dfs(node.right,path + node.val+"->");

    }
}