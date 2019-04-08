public class SelectSort{
	public static void main(String[] args){
		int[] a={7,2,99,56,44,79,154,86,3,44};
		selectSort(a);
	}
	public static void selectSort(int[] a){
		for(int i=0;i<a.length;i++){
			int lowIndex=i;
			for(int j=i;j<a.length;j++){
				if(a[j]<a[lowIndex]){
					lowIndex=j;
				}
			}
			int temp=a[lowIndex];
			a[lowIndex]=a[i];
			a[i]=temp;
		}
		for(int i:a){
			System.out.println(i);
		}
	}

}