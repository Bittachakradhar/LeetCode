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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root)[1];
    }

    private int[] diameter(TreeNode node) {
        if (node == null) return new int[]{0, 0}; // {height, diameter}

        int[] left = diameter(node.left);
        int[] right = diameter(node.right);

        int height = Math.max(left[0], right[0]) + 1;
        int maxDiameter = Math.max(left[1], Math.max(right[1], left[0] + right[0]));

        return new int[]{height, maxDiameter};
    }
}