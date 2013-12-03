public class InsertionSort{
	public static void main(String[] args){
		int[] array = {20,4,19,3,16,15,5,7,1,12,0,14,13,11,2,6,18,9,8,10};
		int n = array.length;
		for(int x=0;x<n;x++)
			System.out.print("["+array[x]+"]");
		System.out.println();
		for(int i=1;i<n;i++){
			int next=array[i];
			int index=i;
			for(; index>0 && array[index-1]>next; index--){
				array[index]=array[index-1];
			//while(index>0 && array[index-1]>next){
				//array[index]=array[index-1];
				//index--;
				for(int x=0;x<n;x++)
					System.out.print("["+array[x]+"]");
				System.out.println();
			}
			array[index]=next;
			for(int x=0;x<n;x++)
					System.out.print("["+array[x]+"]");
				System.out.println();
		}
		for(int x=0;x<n;x++)
					System.out.print("["+array[x]+"]");
				System.out.println();
	}
}