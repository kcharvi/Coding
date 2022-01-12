import java.util.*;
public class RandomizedQS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Quick Sort");
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        int[] A=new int[n];

        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        random_qs(A,0,n-1);
        System.out.println("After sorting using QuickSort");
        for(int x:A)System.out.print(x+" ");
        sc.close();
    }
    public static void random_qs(int[] A,int p,int r){
        if(p<r){
            int q=random_partition(A,p,r);
            random_qs(A,p,q-1);
            random_qs(A,q+1,r);
        }
    }
    public static int random_partition (int[] A,int p, int r){
    	random(A,p,r);
        int ele=A[r];
        int idx=p-1;
        for(int j=p;j<=r-1;j++){
            if(A[j]<=ele){
                idx++;
                swap(A,idx,j);
            }
        }
        swap(A,idx+1,r);
        return idx+1;
    }
    static void random(int A[],int p,int r){     
    	Random rand = new Random();
        int pivot = rand.nextInt(r-p)+p;  
        swap(A,pivot,r);
    }
    public static void swap(int[] A,int i, int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
   
}

