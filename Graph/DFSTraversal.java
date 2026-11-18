// DFS of Graph
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class DFSTraversal{
    public static ArrayList<Integer> dfs(ArrayList<List<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        dfs(0, adj, visited, ans);
        return ans;
    }
    public static void dfs(int node, ArrayList<List<Integer>> adj, boolean[] visited, ArrayList<Integer> ans){
        visited[node] = true;
        ans.add(node);
        for(int nei : adj.get(node)){
            if(!visited[nei]){
                dfs(nei, adj, visited, ans);
            }
        }
        return;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(2,3,1));
        adj.add(Arrays.asList(0));
        adj.add(Arrays.asList(0, 4));
        adj.add(Arrays.asList(0));
        adj.add(Arrays.asList(2));
        ArrayList<Integer> result = dfs(adj);
        System.out.println(result);
    }
}