import java.util.*;
public class StackQueue {
    static Queue q1,q2;
    static Scanner in=new Scanner(System.in);
    StackQueue()
    {
        System.out.println("Enter size");
        int n=in.nextInt();
        q1=new Queue(n);
        q2=new Queue(n);
    }
    public static void push(int x)
    {
        if(q1.front==-1)
            q1.enqueue(x);
        
        else
        {
        	int size=q1.size();
            for(int i=0;i<size;i++)
                q2.enqueue(q1.dequeue());
            
            q1.enqueue(x);
            for(int j=0;j<size;j++)
                q1.enqueue(q2.dequeue());
            
        }
        System.out.println("After pushing elements in stack are");
        q1.Qdisplay();
    }
    public static void pop()
    {
        int temp=q1.dequeue();
        System.out.println("Element "+temp+" is popped");
        System.out.println("After popping elements in stack are");
        q1.Qdisplay();
    }
    public static void Speek()
    {
        int temp=q1.Qpeek();
        System.out.println("The top element in Stack is "+temp);
    }
    public static void Sdisplay()
    {
        q1.Qdisplay();
    }
public static void main(String args[])
{
    StackQueue s=new StackQueue();
    int c;
    do {
    	System.out.println("Enter your choice");
        System.out.println("1. PUSH \n 2. POP \n 3. PEEK \n 4. DISPLAY \n 5.Exit");
        c=in.nextInt();
    switch(c)
    {
        case 1:
                System.out.println("Enter element to push");
                int x=in.nextInt();
                s.push(x);
                break;
        case 2:
                s.pop();
                break;
        case 3:
                s.Speek();
                break;
        case 4:
                s.Sdisplay();
                break;
        default: System.out.println("Invalid choice");
                    break;
    }
    }while(c!=5);
}

}
//class Queue{
//	static int Q[],n,front=-1,rear=-1,count=0;
//	Queue(int n){
//		this.n=n;
//		Q=new int[n];
//	}
//	static Scanner sc=new Scanner(System.in);
//	public static void enqueue(int x){
//		if(rear==n-1)
//			System.out.println("Stack is full");
//		else{
//			if(front==-1)
//				front=0;
//			rear++;
//			Q[rear]=x;
//			count++;
//		}
//	}
//	public static int dequeue(){
//		if(front==-1)
//			{System.out.println("Stack is empty");}
//		else{
//			//System.out.println(Q[front]+" is dequeued");
//			count--;
//			if(front==rear)
//				front=rear=-1;
//			else{
//				for(int i=front;i<rear;i++)
//					Q[i]=Q[i+1];
//				rear--;
//			}
//		}
//		return Q[front];
//	}
//	public void Qdisplay(){
//		if(front==-1)
//			{System.out.println("Stack is empty");}
//		else{
//			for(int i=front;i<=rear;i++)
//				System.out.print(Q[i]+"   ");
//			System.out.println();
//		}
//	}
//	public int Qpeek(){
//        if (isEmpty()){
//            System.out.println("Stack is empty");
//        }
//        return Q[front];
//    }
//    public static Boolean isEmpty(){
//        return (front==-1);
//    }
//     public int size(){
//       return count;
//    }
//}

class Queue
{
    private int[] arr;      // array to store queue elements
    private int front;      // front points to the front element in the queue
    private int rear;       // rear points to the last element in the queue
    private int capacity;   // maximum capacity of the queue
    private int count;      // current size of the queue
 
    // Constructor to initialize a queue
    Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
 
    // Utility function to dequeue the front element
    public void dequeue()
    {
        // check for queue underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
 
        System.out.println("Removing " + arr[front]);
 
        front = (front + 1) % capacity;
        count--;
    }
 
    // Utility function to add an item to the queue
    public void enqueue(int item)
    {
        // check for queue overflow
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }
 
        System.out.println("Inserting " + item);
 
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
 
    // Utility function to return the front element of the queue
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }
 
    // Utility function to return the size of the queue
    public int size() {
        return count;
    }
 
    // Utility function to check if the queue is empty or not
    public Boolean isEmpty() {
        return (size() == 0);
    }
 
    // Utility function to check if the queue is full or not
    public Boolean isFull() {
        return (size() == capacity);
    }
}