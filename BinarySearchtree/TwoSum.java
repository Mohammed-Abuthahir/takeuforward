// 122. Two sum in BST
import java.util.*;
import java.util.Scanner;
class TwoSum{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean inorder(TreeNode root, HashSet<Integer> set, int target){
        if(root == null) return false;
        if(inorder(root.left, set, target)) return true;
        if(set.contains(target - root.val)) return true;
        set.add(root.val);
        return inorder(root.right, set, target);
    }
    public static boolean twoSum(TreeNode root, int target){
        HashSet<Integer> set = new HashSet<>();
        return inorder(root, set, target);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        int target = 5;
        boolean result = twoSum(root, target);
        System.out.println(result);
    }
}