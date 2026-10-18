// 55. LCA in BST
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class LowestCommonAncestor{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode LCA(TreeNode root, int p, int q){
        TreeNode curr = root;
        while(curr != null){
            if(curr.val > p && curr.val > q){
                curr = curr.left;
            }
            else if(curr.val < p && curr.val < q){
                curr = curr.right;
            }
            else return curr;
        }
        return null;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int p = 2;  int q = 4;
        TreeNode result = LCA(root, p, q);
        System.out.println(result.val);
    }
}