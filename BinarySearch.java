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

变种：当相等的时候也不返回，要一直循环到最后一个，根据情况确定是否是>=和返回left 还是 right（根据是去左边找还是右边找）