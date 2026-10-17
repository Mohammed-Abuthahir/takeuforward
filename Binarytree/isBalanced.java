// 53. Check for balanced binary tree
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isBalanced{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    boolean ans = true;
    public int checkBalance(TreeNode root){
        if(root == null) return 0;
        int leftSum = checkBalance(root.left);
        int rightSum = checkBalance(root.right);
        if(Math.abs(leftSum - rightSum) > 1) ans = false;
        return 1 + Math.max(leftSum, rightSum);
    }
    public boolean balance(TreeNode root){
        checkBalance(root);
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.right = new TreeNode(3);
        isBalanced B = new isBalanced();
        boolean result = B.balance(root);
        System.out.println(result);
    }
}