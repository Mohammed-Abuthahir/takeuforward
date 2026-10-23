// 113. Bottom view of BT
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class bottomView{
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
    public static List<Integer> bottomview(TreeNode root){
        List<Integer> nums = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            Pair curr = queue.poll();
            map.put(curr.col , curr.node.val);
            if(curr.node.left != null){
                queue.offer(new Pair(curr.node.left, curr.col - 1));
            }
            if(curr.node.right != null){
                queue.offer(new Pair(curr.node.right, curr.col + 1));
            }
        }
        for(int val : map.values()){
            nums.add(val);
        }
        return nums;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        root.right = new TreeNode(22);
        root.right.right = new TreeNode(25);
        List<Integer> result = bottomview(root);
        System.out.println(result);
    }
}