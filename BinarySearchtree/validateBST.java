// 75. Check if a tree is a BST or not
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class validateBST{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean validate(TreeNode root, long min, long max){
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }
    public static boolean isBST(TreeNode root){
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        boolean result = isBST(root);
        System.out.println(result);
    }
}