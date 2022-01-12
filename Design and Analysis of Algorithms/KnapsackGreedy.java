import java.util.Scanner;
public class KnapsackGreedy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
60
28
20
24
 
10
7
4
2
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of items: ");
		int n=sc.nextInt();
		int[] profit=new int[n];
		int[] weights=new int[n];
		System.out.println("Max weight: ");
		int W=sc.nextInt();
		System.out.println("Enter the profits: ");
		for (int i = 0; i < profit.length; i++) {
			profit[i]=sc.nextInt();
		}
		System.out.println("Enter the weights: ");
		for (int i = 0; i < weights.length; i++) {
			weights[i]=sc.nextInt();
		}
		int[] ratio = new int[n];
		for (int j = 0; j < ratio.length; j++) {
			ratio[j]=profit[j]/weights[j];
		}
		
		for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ratio[i]<ratio[j])
                {
                	int temp=ratio[i];
                	ratio[i]=ratio[j];
                    ratio[j]=temp;
                	
                    int temp1=profit[i];
                    profit[i]=profit[j];
                    profit[j]=temp1;
                   
                    int temp2=weights[i];
                    weights[i]=weights[j];
                    weights[j]=temp2;
                }
            }
        }
		int sum=0;
		int i=0;
		while(i<n) {
			int curr_wt = weights[i];
			if (W - curr_wt >= 0) {
				W = W -curr_wt;
				sum += profit[i];
			}
			else {
				double fractional	= ((double)W / (double)curr_wt);
				sum += (profit[i] * fractional);
				W = (int)(W - (curr_wt * fractional));
				break;
			}
			i++;
		}
		System.out.println("The maximum profit: "+sum);
		System.out.println("Items selected: ");
		for (int j = 0; j <= i; j++) {
			System.out.print(profit[j]+ "\t");
		}
		System.out.println();
		for (int j = 0; j <= i; j++) {
			System.out.print(weights[j]+ "\t");
		}
	}

}
