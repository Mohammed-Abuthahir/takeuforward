// 992. Range Sum in BST
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class rangeSumBST{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static int rangeSum(TreeNode root, int low, int high){
        if(root == null) return 0;
        if(root.val < low){
            return rangeSum(root.right, low, high);
        }
        if(root.val > high){
            return rangeSum(root.left, low, high);
        }
        return root.val + rangeSum(root.left, low, high) + rangeSum(root.right, low, high);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(10);
        int low = 3;
        int high = 7;
        int result = rangeSum(root, low, high);
        System.out.println(result);
    }
}
