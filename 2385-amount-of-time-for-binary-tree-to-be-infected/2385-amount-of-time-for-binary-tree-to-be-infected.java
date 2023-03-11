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

class Solution {
    Map<Integer,List<Integer>> graph = new HashMap<>();
    
    public void convertToGraph(TreeNode root,int parent){
        if(root==null) return;
        
        List<Integer> list = graph.getOrDefault(root.val,new ArrayList<>());
        if(root.left!=null) list.add(root.left.val);
        if(root.right!=null) list.add(root.right.val);
        if(parent!=-1) list.add(parent);
        graph.put(root.val,list);
        
        convertToGraph(root.left,root.val);
        convertToGraph(root.right,root.val);
    }
    
    public int amountOfTime(TreeNode root, int start) {
        convertToGraph(root,-1);
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