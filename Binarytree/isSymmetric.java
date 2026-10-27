// 105. Check for symmetrical BTs
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class isSymmetric{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean checksymmetric(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;
        return checksymmetric(root1.left, root2.right) && checksymmetric(root1.right, root2.left);
    }
    public static boolean isSymmetric(TreeNode root){
        return checksymmetric(root.left, root.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        boolean result = isSymmetric(root);
        System.out.println(result);
    }
}