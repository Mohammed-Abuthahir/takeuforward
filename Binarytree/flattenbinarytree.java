// 234. Flatten Binary Tree to Linked List
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class flattenbinarytree{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode recursiveRight(TreeNode root){
        TreeNode curr = root;
        while(curr.right != null){
            curr = curr.right;
        }
        return curr;
    }
    public static void flatten(TreeNode root){
        if(root == null) return;
        TreeNode curr = root;
        while(curr != null){
            TreeNode temp = curr.right;
            curr.right = curr.left;
            curr.left = null;
            TreeNode rightMost = recursiveRight(curr);
            rightMost.right = temp;
            curr = curr.right;
        }
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        flatten(root);
        preorder(root);
    }
    public static void preorder(TreeNode root){
        if(root == null) return;
        preorder(root.left);
        System.out.print(root.val + " -> ");
        preorder(root.right);
    }
}