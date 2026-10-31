// 180. Top View of BT
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class topView{
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    static class Pair{
        TreeNode node;
        int col;
        Pair(TreeNode node, int col){
            this.node = node;
            this.col = col;
        }
    }
    public static List<Integer> topView(TreeNode root){
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            if(!map.containsKey(curr.col)){
                map.put(curr.col, curr.node.val);
            }
            if(curr.node.left != null){
                queue.offer(new Pair(curr.node.left, curr.col - 1));
            }
            if(curr.node.right != null){
                queue.offer(new Pair(curr.node.right, curr.col + 1));
            }
        }
        List<Integer> nums = new ArrayList<>();
        for(int val : map.values()) nums.add(val);
        return nums;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> result = topView(root);
        System.out.println(result);
    }
}