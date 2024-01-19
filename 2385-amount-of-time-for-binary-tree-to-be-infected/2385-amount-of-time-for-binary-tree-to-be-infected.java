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
    private  Map<Integer, List<Integer>> graph = new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        convertBinaryTreeToGraph(root);
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        int time = 0;

        while (!queue.isEmpty()) {
            time++;
            for (int i = queue.size(); i > 0; i--) {
                int currentNode = queue.pollFirst();
                visited.add(currentNode);

                if (graph.containsKey(currentNode)) {
                    for (int neighbor : graph.get(currentNode)) {
                        if (!visited.contains(neighbor)) {
                            queue.offer(neighbor);
                        }
                    }
                }
            }
        }
        return time-1;
    }


    private void convertBinaryTreeToGraph(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            graph.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.left.val);
            graph.computeIfAbsent(node.left.val, k -> new ArrayList<>()).add(node.val);
        }

        if (node.right != null) {
            graph.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.right.val);
            graph.computeIfAbsent(node.right.val, k -> new ArrayList<>()).add(node.val);
        }


        convertBinaryTreeToGraph(node.left);
        convertBinaryTreeToGraph(node.right);
    }
}