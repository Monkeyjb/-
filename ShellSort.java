public class ShellSort{
	public static void main(String[] args){
		int[] a={34,67,11,24,36,16,88,96,57};
		shellSort(a);
		for(int i:a){
			System.out.println(i);
		}
	}
	public static void shellSort(int[] a){
		int n=a.length;
		int gap=n/2;
		while(gap>=1){
			for(int i=gap;i<n;i++){
				int temp=a[i];
				for(int j=i;j>=gap&&temp<a[j-gap];j-=gap){
					a[j]=a[j-gap];
					a[j-gap]=temp;
				}
			}		
		gap=gap/2;
		}
	}
}