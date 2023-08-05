import java.util.ArrayList;
import java.util.List;

public class BST_II {


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    class Solution {
        public List<TreeNode> generateTrees(int n) {
            if (n == 0) {
                return new ArrayList<>();
            }

            return generateTrees(1, n);
        }

        private List<TreeNode> generateTrees(int start, int end) {
            List<TreeNode> result = new ArrayList<>();

            if (start > end) {
                result.add(null);
                return result;
            }

            for (int i = start; i <= end; i++) {
                List<TreeNode> leftSubtrees = generateTrees(start, i - 1);
                List<TreeNode> rightSubtrees = generateTrees(i + 1, end);

                for (TreeNode leftSubtree : leftSubtrees) {
                    for (TreeNode rightSubtree : rightSubtrees) {
                        TreeNode root = new TreeNode(i);
                        root.left = leftSubtree;
                        root.right = rightSubtree;
                        result.add(root);
                    }
                }
            }

            return result;
        }
    }

}
