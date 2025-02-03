class Solution {
    public int pathSum(TreeNode root, int target) {
        if(root==null) return 0;
        int res=(int)path(root,target)+ pathSum(root.left,target)+pathSum(root.right,target);
        return res;
    }
    public long path(TreeNode node,long target){
        if(node == null) return 0;
        long count=0;
        if(node.val*1l == target) count = 1*1l;
        long lans=path(node.left,target-node.val*1l);
        long rans=path(node.right,target-node.val*1l);
        count = count + lans*1l + rans*1l ;
        return count;
        }

}