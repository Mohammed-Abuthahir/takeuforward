// 29. Diameter of Binary Tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class diameter{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){
            this.val = val;
        }
    }
    int diameter = 0;
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);
        diameter = Math.max(diameter, leftSum + rightSum);
        return 1 + Math.max(leftSum ,rightSum);
    }
    public int diameterOfBinaryTree(TreeNode root){
        dfs(root);
        return diameter;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        diameter d1 = new diameter();
        int result = d1.diameterOfBinaryTree(root);
        System.out.println(result);
    }
}