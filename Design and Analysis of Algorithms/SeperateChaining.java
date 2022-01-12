import java.util.Scanner;
class Lnode
{
	int data;
	Lnode next;
}
public class SeperateChaining 
{
	static Lnode a[];
	static int n;
	public static void main(String args[])
	{
		int ch;
		System.out.println("enter the size of the hash table");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new Lnode[n];
		do
		{
			System.out.println("Hashing");
			System.out.println("1.insert");
			System.out.println("2.Search");
			System.out.println("3.Display");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("emter ur choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:insert();
			       break;
			case 2:Search();
			       break;
			case 3:display();
			       break;
			case 4:delete();
			       break;
            case 5:System.exit(0);
            }
        }while(ch!=5);
    }
	
	public static void insert()
	{
		int x,key;
		Lnode temp;
		System.out.println("Enter the number to insert");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		key=x%n;
		Lnode newnode=new Lnode();
		newnode.data=x;
		newnode.next=null;
		if(a[key]==null)
		{
			a[key]=newnode;
		}
		else
		{
			temp=a[key];
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newnode;
		}
	}
	
	public static void display()
	{
		for(int i=0;i<n;i++)
		{
			Lnode root=a[i];
			if(root==null)
				System.out.println("");
			else
			{
				Lnode temp=root;
				while(temp.next!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
				System.out.print(temp.data+" ");
			}
			System.out.println("");
		}
	}
	public static void Search()
	{
		int x,key,f=0;
		Lnode temp;
		System.out.println("Enter the element to Search");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		key=x%n;
		if(a[key]==null)
		{
			System.out.println("Element not found");
		}
		else
		{
			temp=a[key];
			while(temp!=null)
			{
				if(temp.data==x)
				{
					f=1;
					break;
				}
				temp=temp.next;
			}
			if(f==1)
				{
				System.out.println("Element found");
				}
			else
			{
				System.out.println("Element not found");
			}
		}
	}
	public static void delete()
	{
		int x,key;
		Lnode temp;
		System.out.println("Enter the number to delete");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		key=x%n;
		if(a[key].data==x)
		{
			a[key]=a[key].next;
		}
		else
		{
			Lnode p=a[key];
			temp=a[key];
			while(temp.next!=null)
			{
				if(temp.data==x)
					break;
				else
				{
					p=temp;
					temp=temp.next;
				}
			}
			if(temp.next==null)
				p.next=null;
			else
				p.next=temp.next;
		}
	}
}