public class MergeSort{
	public static void main(String[] args){
		int[] array = {20,4,19,3,16,15,5,7,1,12,0,14,13,11,2,6,18,9,8,10};
		int[] tmpArray = new int[array.length];
		for(int i=0;i<array.length;i++)
				System.out.print("["+array[i]+"]");
			System.out.println();
		mergeSort(array,tmpArray,0,array.length-1);
	}

	public static void mergeSort(int[] array, int[] tmpArray, int first, int last){
	//	System.out.println("first: "+first+" Last: "+last);
		if(first<last){
			int mid=(first+last)/2;
			mergeSort(array,tmpArray,first,mid);
			//for(int i=first;i<=mid;i++)
			//	System.out.print("["+array[i]+"]");
			//System.out.print("\t");
			mergeSort(array,tmpArray,mid+1,last);
			//for(int i=mid+1;i<=last;i++)
			//	System.out.print("["+array[i]+"]");
			merge(array,tmpArray,first,mid,last);
			for(int i=0;i<array.length;i++)
				System.out.print("["+array[i]+"]");
			System.out.println();
		}
	}

	public static void merge(int[] array, int[] tmpArray, int first, int mid, int last){
		int first1 = first;
		int last1 = mid;
		int first2 = mid+1;
		int last2 = last;
		int index = first1;
		while((first1<=last1)&&(first2<=last2)){
			if(array[first1]<array[first2]){
				tmpArray[index]=array[first1];
				first1++;
			}else{
				tmpArray[index]=array[first2];
				first2++;
			}
			index++;
		}
		while(first1<=last1){
			tmpArray[index]=array[first1];
			first1++;
			index++;
		}
		while(first2<=last2){
			tmpArray[index]=array[first2];
			first2++;
			index++;
		}
		for(index=first;index<=last;index++){
			array[index]=tmpArray[index];
		}
	}
}