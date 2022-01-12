import java.util.*;
public class JobSeq
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of jobs : ");
        int n=sc.nextInt();
        int profit[]=new int[n];
        int deadline[]=new int[n];
        System.out.println("Enter profit array : ");
        for(int i=0;i<n;i++)
        {
            profit[i]=sc.nextInt();
        }
        System.out.println("Enter deadline array : ");
        for(int i=0;i<n;i++)
        {
            deadline[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(profit[i]<profit[j])
                {
                    int temp=profit[i];
                    profit[i]=profit[j];
                    profit[j]=temp;
                   
                    int temp1=deadline[i];
                    deadline[i]=deadline[j];
                    deadline[j]=temp1;
                }
            }
        }
        System.out.println("Profit & Deadline Array after sorting : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(profit[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(deadline[i]+" ");
        }
        System.out.println();
       
        int max=deadline[0];
        for(int i=1;i<n;i++)
        {
            if(max<deadline[i])
            {
                max=deadline[i];
            }
        }
        int jobseq[]=new int[max];
        for(int i=0;i<max;i++)
        {
            jobseq[i]=-1;
        }
        //for(int i=0;i<max;i++)
        //{
   
        for(int j=0;j<n;j++)
        {
            int w=deadline[j]-1;
            if(jobseq[w]==-1)
            {
                jobseq[w]=profit[j];
                count++;
            }
            else
            {
                while(w>0)
                {
                    w--;
                    if(jobseq[w]==-1)
                    {
                        jobseq[w]=profit[j];
                        count++;
                        break;
                    }
                }
            }
            if(count>max)
            {
                break;
            }
        }
        //}
        System.out.println("Final Job Array is : ");
        for(int i=0;i<max;i++)
        {
            System.out.print(jobseq[i]+" ");
        }
    }
   
}
