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
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Reach the left most TreeNode
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Current must be null at this point
            curr = stack.pop();
            result.add(curr.val);

            // We have visited the node and its left subtree
            // Now, it's right subtree's turn
            curr = curr.right;
        }

        return result;
    }
}
