
class QuickSort{
	public static void main(String[] args){
		int[] arr = { 2,8,7,1,3,5,6,4 };
		int n = arr.length;
		System.out.println("TAKING 0-based index");
		System.out.println("quickSort(A,"+0+","+(n-1)+")");
		quickSort(arr, 0, n - 1);
		
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high){
		int x = arr[high];
		int i = (low - 1);
		System.out.println("x="+x+" i="+i);
		int[] slice = new int[high-low+1];
        for (int k = 0; k < slice.length; k++) {
            slice[k] = arr[low + k];
        }
        printArray(slice, slice.length);
		for(int j = low; j <= high - 1; j++){
			System.out.println("j="+j);
			System.out.println("("+arr[j]+"<="+x+")");
			if (arr[j] <= x){	
				System.out.println("yes");
				i++;
				System.out.println("i="+i);
				System.out.println("swap "+arr[i]+","+arr[j]);
				swap(arr, i, j);
				System.out.print("after swapping ");
				printArray(arr, arr.length);
			}
			printArray(arr, arr.length);
		}
		System.out.println("last swap "+arr[i+1]+","+arr[high]);
		swap(arr, i + 1, high);
		printArray(arr, arr.length);
		System.out.println("return i+1: "+(i+1));
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high){
		if (low < high){
			System.out.println("partition(A,"+low+","+high+")");
			int pi = partition(arr, low, high);
			System.out.println("quickSort(A,"+low+","+(pi-1)+")");
			quickSort(arr, low, pi - 1);
			System.out.println("quickSort(A,"+(pi+1)+","+high+")");
			quickSort(arr, pi + 1, high);
		}
	}

	static void printArray(int[] arr, int size){
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");		
		System.out.println();
	}
	
}
