/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    TreeNode node;
    int parent;
    Pair(TreeNode node,int parent){
        this.node = node;
        this.parent = parent;
    }
}
class Solution {
    Map<Integer,List<Integer>> graph = new HashMap<>();
    
    public void convertToGraph(TreeNode root){
        Queue<Pair> q = new LinkedList<>();
        
        q.offer(new Pair(root,-1));

        
        while(q.size()>0){
            int n = q.size();
            
            for(int i=0;i<n;i++){
                Pair p = q.poll(); 
                TreeNode node = p.node;
                int parent = p.parent;
                 List<Integer> list = graph.getOrDefault(node.val,new ArrayList<>());
                if(parent!=-1) list.add(parent);
                
                if(node.left!=null){
                    q.offer(new Pair(node.left,node.val));
                    list.add(node.left.val);
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right,node.val));
                    list.add(node.right.val);
                }
                
                graph.put(node.val,list);
            }
           
            
        }
    }
    
    public int amountOfTime(TreeNode root, int start) {
        convertToGraph(root);
        // System.out.print(graph);
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        
        Set<Integer> vis = new HashSet<>();
        
        vis.add(start);
        int count = 0;
        while(q.size()>0){
           
            count++;
            int n = q.size();
            while(n-->0){
                for(int nbr: graph.get(q.poll())){
                    if(!vis.contains(nbr)){
                        vis.add(nbr);
                        q.offer(nbr);                    
                    }
                }
            }
        }
        return count-1;
        
        
        
    }
}