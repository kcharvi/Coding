import java.util.Scanner;

public class LinearProbe 
{
	static int a[],n,c=0;
	public static void main(String args[])
	{
		int ch;
		System.out.println("enter the size of the hash table");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=-1;
		}
		do
		{
			System.out.println("Hashing");
			System.out.println("1.insert");
			System.out.println("2.Search");
			System.out.println("3.Display");
			System.out.println("4.Delete");
			System.out.println("emter ur choice");
			ch=sc.nextInt();
			switch(ch)
			{case 1:insert();
			c++;
			break;
			case 2:Search();
			break;
			case 3: display();
			break;
			case 4: delete();
			break;
			case 5:System.exit(0);
			}
	    }while(ch!=5);
	}
	public static void insert()
	{
		int x,key,i,index;
		System.out.println("Enter the number to insert");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		key=x%n;
		for(i=0;i<n;i++)
		{
			index=(key+i)%n;
			if(a[index]==-1)
			{
				a[index]=x;
				break;
			}
		}
		if(i>=n)
		{
			System.out.println("Array is full can not insert");
		}
	}
	public static void Search()
	{
		int x,key,f=0,i,index;
		System.out.println("Enter the element to Search");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		key=x%n;
		for(i=0;i<n;i++)
		{
			index=(key+i)%n;
			if(a[index]==x)
			{
				f=1;
				break;
				}
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
	public static void display()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void delete()
	{
		int x,key,index,i=0;
		System.out.println("Enter the number to delete");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		key=x%n;
		for(i=0;i<n;i++)
		{
			index=(key+i)%n;
			if(a[index]==x)
			{
				a[index]=-1;
				System.out.println("element deleted is"+x);
				break;
			}
		}
		sc.close();
	
	}
}