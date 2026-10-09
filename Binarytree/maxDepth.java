// 18. Maximum Depth in BT
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class maxDepth{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static int DFS(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(DFS(root.left), DFS(root.right));
    }
    public static int BFS(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0; queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size; i++){
                TreeNode curr = queue.poll();
                if(curr.left != null)  queue.offer(curr.left);
                if(curr.right != null)  queue.offer(curr.right);
            }
            depth++;
        }
        return depth;
    }
    public static int MaxDepth(TreeNode root){
        int bfsans = BFS(root);
        int dfsans = DFS(root);
        return bfsans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int result = MaxDepth(root);
        System.out.print(result);
    }
}