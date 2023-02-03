//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}


class GfG
{
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {   
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
            
            Solution g = new Solution();
             
            Node res = g.mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int k)
    {
        //Add your code here.
       
       return mergeSort(arr,0,k-1);
        
    }
    
    Node mergeSort(Node[] arr,int s,int e){
        if(s==e) return arr[s];
        int m = (s+e)/2;
        Node left = mergeSort(arr,s,m);
        Node right = mergeSort(arr,m+1,e);
        return merge(left,right);
    }
    
    Node merge(Node f,Node s){
        if(f==null) return s;
        if(s==null) return f;
        Node temp = new Node(0);
        Node head = temp;
        while(f!=null && s!=null){
            if(f.data<s.data){
                temp.next = f;
                f=f.next;
            }else{
                temp.next = s;
                s=s.next;
            }
            temp=temp.next;
        }
        if(f==null) temp.next = s;
        else temp.next = f;
        return head.next;
    }
}
