public class BinarySearch{
	public static void main(String[] args){
		int[] a={5,9,44,87,98,102,222};
		System.out.println(erfen(a,98));
	}
	public static int binarySearch(int[] a,int target){
		int left=0;
		int right=a.length-1;
		while(left<=right){
			int mid=(left+right)/2;
			if(a[mid]>target){
				right=mid-1;
			}
			if(a[mid]<target){
				left=mid+1;
			}
			if(a[mid]==target){
				return mid;
			}
		}
		return -1;
	}
}

���֣�����ȵ�ʱ��Ҳ�����أ�Ҫһֱѭ�������һ�����������ȷ���Ƿ���>=�ͷ���left ���� right��������ȥ����һ����ұ��ң�