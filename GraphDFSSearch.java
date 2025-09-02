class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    private void visitIndexes(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int index,ArrayList<Integer> result){
        visited[index] = true;
        result.add(index);
        
        for(int i : adj.get(index)){
            if(!visited[i]){
                visitIndexes(adj,visited,i,result);
            }
        }
    } 
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        visitIndexes(adj, visited,0, result);
        return result;
    }
}
