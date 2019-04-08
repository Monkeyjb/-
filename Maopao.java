
public class Maopao{
	public static void main(String[] args){
		int[] a={8,5,99,7,1,2,6};
		maopao(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static void maopao(int[] a){
		int length=a.length;
		boolean flag=true;
		while(flag){
			flag=false;
			for(int j=0;j<length-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					flag=true;
				}
			}
		length--;
		}
	}


}