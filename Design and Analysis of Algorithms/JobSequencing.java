import java.util.*;

public class JobSequencing {int id;
int deadline, profit;
public JobSequencing() {}
public JobSequencing(int id, int deadline, int profit){
    this.id = id;
    this.deadline = deadline;
    this.profit = profit;
}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<JobSequencing> arr = new ArrayList<JobSequencing>();
		System.out.println("Enter number of jobs: ");
		int n=sc.nextInt();
		int maxTime=0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Job id(String): ");
			int id_=sc.nextInt();
			System.out.println("Enter the profit for J"+id_+": ");
			int pro_=sc.nextInt();
			System.out.println("Enter the deadline for J"+id_+": ");
			int d_=sc.nextInt();
			if(maxTime<d_)maxTime=d_;
			arr.add(new JobSequencing(id_,pro_,d_));
		}
		System.out.println("Following is maximum "
                + "profit sequence of jobs");

		JobSequencing job = new JobSequencing();

		job.printJobScheduling(arr, maxTime);
		int res[] = new int[maxTime];
		
		sc.close();
	}
	static void printJobScheduling(ArrayList<JobSequencing> arr, int t)
    {
        int n = arr.size();
        Collections.sort(arr,
                         (a, b) -> b.profit - a.profit);
        boolean result[] = new boolean[t];
        int job[] = new int[t];
        for (int i = 0; i < n; i++){
            for (int j = Math.min(t - 1, arr.get(i).deadline - 1);
                 j >= 0; j--) {
            	if (result[j] == false){
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
            }
        }
        int maxProfit=0;
        for (Integer jb : job){
        	maxProfit+=jb.get(1);
            System.out.print("J"+jb + " ");
        }
        System.out.println();
        System.out.println();
    }
	
}
