// Convert BST to Greater Tree
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class GreaterTree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode convertBST(TreeNode root){
        int[] sum = new int[]{0};
        reverseInorder(root, sum);
        return root;
    }
    private static void reverseInorder(TreeNode root, int[] sum){
        if(root == null) return;
        reverseInorder(root.right, sum);
        sum[0] = sum[0] + root.val;
        root.val = sum[0];
        reverseInorder(root.left, sum);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right  = new TreeNode(8);
        TreeNode result = convertBST(root);
        display(root);
    }
    public static void display(TreeNode root){
        if(root == null) return ;
        display(root.left);
        System.out.println(root.val);
        display(root.right);
    }
}