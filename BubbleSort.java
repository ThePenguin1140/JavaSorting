
public class BubbleSort { 

	public static void main(String[] args){
		int[] data = {20,4,12,19,3,16,15,5,7,1,0,14,13,11,2,6,18,9,8,10};
		boolean sorted = false;
		int n = data.length;
		for(int x=0;x<n;x++)
			System.out.print("["+data[x]+"]");
		System.out.println();
		for(int i=1;i<n && !sorted; i++){
			sorted=true;
			for(int index=0;index < n-i; index++){
				int next = index+1;
				for(int x=0;x<n;x++)
						System.out.print("["+data[x]+"]");
				System.out.println();
				//System.out.println("Loop 1: "+i+"\nLoop 2: "+index);
				//System.out.println("Comparing "+index+" with "+next);
				if(data[index]>data[next]){
					int temp = data[index];
					data[index]=data[next];
					data[next]=temp;
					sorted=false;
				}
			}
		}
		for(int x=0;x<n;x++)
			System.out.print("["+data[x]+"]");
		System.out.println();
	}
}