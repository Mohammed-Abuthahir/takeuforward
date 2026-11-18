// BFS of Graph
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class BFSTraversal{
    public static ArrayList<Integer> bfs(ArrayList<List<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adj.size()];
        queue.add(0);
        while(!queue.isEmpty()){
            int node = queue.poll();
            ans.add(node);
            for(int nei : ans.get(node)){
                if(!visited[nei]){
                    queue.add(nei);
                    visited[nei] = true;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(2,3,1));
        adj.add(Arrays.asList(0));
        adj.add(Arrays.asList(0, 4));
        adj.add(Arrays.asList(0));
        adj.add(Arrays.asList(2));
        ArrayList<Integer> result = bfs(adj);
        System.out.println(result);
    }
}