class Solution {
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
    public int dfs(TreeNode node){
        if(node==null)return 0;
       int left=dfs(node.left);
       int right=dfs(node.right);
       int mans=0;
       if(left>=right){
        mans=1+left;
       }
       else{
        mans=1+right;
       }
    return mans;
    }
}