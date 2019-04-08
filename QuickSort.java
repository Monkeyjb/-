public class QuickSort{
	public static void main(String[] args){
		int[] a={5,12,5,7,3,44,3,42,33,2};
		quickSort(a,0,a.length-1);
		for(int i:a){
			System.out.println(i);
		}
		int result=0;
		result=a[0]==2?1:2;
		System.out.println(result);
	}
	public static void quickSort(int[] a,int left,int right){
		if(left>=right){
			return;
		}
		int standard=a[left];
		int l=left;
		int r=right;
		while(r>l){
			while(r>l&&a[r]>=standard){
				r--;
			}
			a[l]=a[r];
			while(r>l&&a[l]<=standard){
				l++;
			}
			a[r]=a[l];
		}
		a[l]=standard;
		quickSort(a,left,l-1);	
		quickSort(a,l+1,right);
		
	}




} 