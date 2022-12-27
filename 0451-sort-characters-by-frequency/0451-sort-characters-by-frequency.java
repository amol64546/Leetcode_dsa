class Solution {
    public String frequencySort(String s) {
        
        
        Map<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        // maxHeap of count, custom sort
        // sort char lexographically, by default
        Queue<Character> pq = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        for(char c: map.keySet())
            pq.offer(c);
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Character c = pq.poll();
            int count = map.get(c);
            while(count-->0){
                sb.insert(0,c);
            }
        }
        return sb.toString();
    }
}