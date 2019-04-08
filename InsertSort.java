public class InsertSort{
	public static void main(String[] args){
		int[] a={9,55,4,7,86,123,56,98,77};
		insertSort(a);
	}
	public static void insertSort(int[] a){
		for(int i=1;i<a.length;i++){
			int temp=a[i];
			int index=i;
			for(int j=i-1;j>=0;j--){
				if(temp<a[j]){
					a[j+1]=a[j];
					index=j;
				}
				
			}
			a[index]=temp;
		}
		for(int i:a){
			System.out.println(i);
		}
	
	}


}