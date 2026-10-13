// 32. Inorder Traversal
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class inorder{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void inorder(TreeNode root, List<Integer> nums){
        if(root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        return nums;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        List<Integer> result = inorderTraversal(root);
        System.out.println(result);
    }
}