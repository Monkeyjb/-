public class MergeSort{
	public static void main(String[] args){
		int[] a={1,55,34,22,47,77,58,97,6};
		mergeSort(a,0,a.length-1);
		for(int i:a){
			System.out.println(i);
		}	

	}
	public static void mergeSort(int[] a,int left,int right){
		if(right-left<1){
			return;
		}
		int mid=(left+right)/2;
		mergeSort(a,left,mid);
		mergeSort(a,mid+1,right);
		merge(a,left,mid,right);
		
	}
	public static void merge(int[] a,int left,int mid,int right){
		int l=left;
		int r=mid+1;
		int[] arr=new int[right-left+1];
		int i=0;
		while(l<=mid&&r<=right){
			if(a[l]<a[r]){
				arr[i++]=a[l++];
			}else{
				arr[i++]=a[r++];
			}
		}
		while(l<=mid){
			arr[i++]=a[l++];
		}
		while(r<=right){
			arr[i++]=a[r++];
		}
		for(int j=0;j<i;j++){
			a[left++]=arr[j];
		}
	}

}