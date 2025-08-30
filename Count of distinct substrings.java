// using trie for storing.
/* define a trie and then iterate over all possibilities */

/*You are required to complete this method */
class node {
    node links[] = new node[26];
    
    public node(){
        
    }
    
    public boolean containsKey(char letter){
        return (links[letter - 'a'] != null);
    }
    public void addKey(char letter, node Node){
        links[letter - 'a'] = Node;
    }
    node getNode(char letter){
        return links[letter - 'a'];
    }
}
class GfG {
    public static int countDistinctSubstring(String st) {
        
        int n = st.length();
        node root = new node();
        int ans = 1;
        for(int i = 0;i < n;i++){
            node Node = root;
            for(int j = i;j < n;j++){
                if(!Node.containsKey(st.charAt(j))){
                    Node.addKey(st.charAt(j),new node());
                    ans++;
                }
                Node = Node.getNode(st.charAt(j));
            }
        }
        return ans;
    }
}

// other method is using hashset where we storeall possbilities and return length of hash bug it will give time limit exceeded and it will take huge place in storing the substrings
/* time complexity = O(n^3logn)
  space complexity = O(n^3) */
