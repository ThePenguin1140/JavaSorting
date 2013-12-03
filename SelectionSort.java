
public class SelectionSort { 

	public static void main(String[] args){
		int[] data = {20,4,12,19,3,16,15,5,7,1,0,14,13,11,2,6,18,9,8,10};
		int n = data.length;
		for(int x=0;x<n;x++)
				System.out.print("["+data[x]+"]");
		for(int last=n-1;last>0;last--){
			int largest = indexOfLargest(data,last+1);
			int tmp = data[largest];
			data[largest]=data[last];
			data[last]=tmp;
			System.out.println();
			for(int x=0;x<n;x++)
				System.out.print("["+data[x]+"]");
		}
		System.out.println();
	}
	public static int indexOfLargest(int[] array, int size){
		int largest = 0;
		for(int i=1;i<size;i++){
			if(array[i]>array[largest])
				largest=i;
		}
		return largest;
	}
}