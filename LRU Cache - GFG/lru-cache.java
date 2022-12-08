//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

  public class LRUDesign {

    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr = 0;

            for (int i = 0; (i < queries) && (itr < len); i++) {
                String queryType = str[itr++];
                if (queryType.equals("SET")) {
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key, value);
                }
                if (queryType.equals("GET")) {
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// design the class in the most optimal way
class Node{
	int key,data;
	Node next,prev;
	Node(){};
	Node(int key,int data){
		this.key = key;
		this.data = data;
	}
}

class LRUCache
{
    static Node first,last;
	static int cap;
	static HashMap<Integer,Node> map;
    //Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap)
    {
        map = new HashMap<>();
		this.cap = cap;
		first = new Node();
		last = new Node();
		first.next = last;
		last.prev = first;
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        if(map.containsKey(key)){
			remove(map.get(key));
			insertLast(map.get(key));
			return map.get(key).data;
		}else{
			return -1;
		}
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        if(map.containsKey(key)){
			remove(map.get(key));
		}
		map.put(key,new Node(key,value));
		insertLast(map.get(key));
		if(map.size()>cap){
			Node lru = first.next;
			remove(lru);
			map.remove(lru.key);
						
		}
    }
    
    public static void insertLast(Node node){
		Node left = last.prev;
		Node right = last;
		left.next = node;
		node.next = right;
		right.prev = node;
		node.prev = left;	
		
	}

	public static void remove(Node node){
		Node left = node.prev;
		Node right = node.next;
		left.next = right;
		right.prev = left;
	}
}
