class LIScount {
	public static void main(String[] args) {
		int arr[] = { 1,3,5,4,7};
        System.out.println("Number Count is " + findNumberOfLIS(arr)
                           + "\n");
	}

	
    public static int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int lis[] =new int[n];
        
        for(int i=0;i<n;i++)lis[i]=1;
        int max_cnt=0;
        for(int i=1;i<n;i++) {int cnt=0;
//        	System.out.print(lis[i]+" ");
            for(int j=0;j<i;j++){   
            	System.out.print(lis[i]+" ");
            	if(nums[i]>nums[j] && lis[j]>=lis[i]) {
            		if(lis[j]==lis[i]) cnt++;
                    lis[i]=lis[j]+1;
                }
            }
        	System.out.println();

			System.out.println(cnt);
            max_cnt=Math.max(max_cnt, cnt);
//        	System.out.println();
        }
            	

        for (int i = 0; i < lis.length; i++) {
			System.out.print(lis[i]+" ");
		}
        System.out.println();
//        int maxest=0;
//        for(int i=0;i<n;i++)maxest=Math.max(maxest,lis[i]);

        
        return max_cnt-1;
    }
}

