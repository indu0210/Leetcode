class Solution {
 public TreeNode addOneRow(TreeNode t, int v, int d) {
        if (d == 1) {
            TreeNode n = new TreeNode(v);
            n.left = t;
            return n;
        }
        insertVal(v, t, 1, d);
        return t;
    }

    public void insertVal(int val, TreeNode node, int depth, int n) {
        if (node == null)
            return;
        if (depth == n - 1) {
            TreeNode t = node.left;
            node.left = new TreeNode(val);
            node.left.left = t;
            t = node.right;
            node.right = new TreeNode(val);
            node.right.right = t;
        } else {
            insertVal(val, node.left, depth + 1, n);
            insertVal(val, node.right, depth + 1, n);
        }
    }
}
