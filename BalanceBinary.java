import java.util.*;
public class BalanceBinary{
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    List<TreeNode> sortedArr = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        sortedArr.clear();
        inorderTraverse(root);
        return sortedArrayToBST(0, sortedArr.size() - 1);
    }
    void inorderTraverse(TreeNode root) {
        if (root == null) return;
        inorderTraverse(root.left);
        sortedArr.add(root);
        inorderTraverse(root.right);
    }
    TreeNode sortedArrayToBST(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = sortedArr.get(mid);
        root.left = sortedArrayToBST(start, mid - 1);
        root.right = sortedArrayToBST(mid + 1, end);
        return root;
    }
    public static TreeNode buildTree(String[] nodes) {
        if (nodes.length == 0 || nodes[0].equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (i < nodes.length) {
            TreeNode curr = queue.poll();
            if (curr == null) continue;
            if (i < nodes.length && !nodes[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(curr.left);
            }
            i++;
            if (i < nodes.length && !nodes[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }
    public static List<String> serialize(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == null) {
                result.add("null");
            } else {
                result.add(String.valueOf(curr.val));
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
        }
        int i = result.size() - 1;
        while (i >= 0 && result.get(i).equals("null")) {
            result.remove(i);
            i--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] nodes = line.isEmpty() ? new String[0] : line.split("\\s+");
        TreeNode root = buildTree(nodes);
        BalanceBinary sol = new BalanceBinary();
        TreeNode balancedRoot = sol.balanceBST(root);
        List<String> serialized = serialize(balancedRoot);
        System.out.println(serialized);
        sc.close();
    }
}