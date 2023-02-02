//{ Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}




// } Driver Code Ends




class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
    int n = arr.length;
    
    MyQueue()
	{
		front=-1;
		rear=-1;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	     
	    if( (rear+1)%n == front) return; // queue overflow
	  
	    if(front == -1) front = 0;  // first time update
	    rear = (rear+1)%n;
	    arr[rear] = x;
	 
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(front==-1) return -1;   // queue underflow
	    
		int val = arr[front];
		if(front==rear) front=rear=-1;
		else    front = (front+1)%n;
		return val;
	} 
}




