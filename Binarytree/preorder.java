// 42. Preorder Traversal
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
class preorder{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static void preorder(TreeNode root, List<Integer> nums){
        if(root == null) return;
        nums.add(root.val);
        preorder(root.left, nums);
        preorder(root.right, nums);
    }
    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        preorder(root, nums);
        return nums;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        List<Integer> result = preorderTraversal(root);
        System.out.println(result);
    }
}