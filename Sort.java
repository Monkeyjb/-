public class Sort{
	public static void main(String[] args){
		int[] a={44,78,4,89,78,47,66,1,54};
		String sa="abcdefgh";
		String sb="ab";
		sa="aa";
		System.out.println(containsStr(sa,sb));
		/*  //�����������
		int[] heap=new int[5];
		for(int i=0;i<heap.length;i++){
			heap[i]=a[i];
		}
		for(int i=heap.length/2-1;i>=0;i--){
			toHeap(heap,i,heap.length);
		}
		for(int i=heap.length;i<a.length;i++){
			if(a[i]>heap[0]){
				heap[0]=a[i];
				toHeap(heap,0,heap.length);
			}
		}
		System.out.println("��������Ϊ��"+heap[0]);
		for(int i:a){
			System.out.println(i);
		}      */
		
	}
	public static boolean containsStr(String a,String b){
		char[]  charsA=a.toCharArray();
		char[]  charsB=b.toCharArray();
		int hash = 0;
		for(int i=0;i<charsA.length;i++){
			hash |= 1<<(charsA[i]-'a');
		} 
		for(int i=0;i<charsB.length;i++){
			if((hash&1<<(charsB[i]-'a'))==0){
				return false;	
			}
		}
		return true;
	}	


	/*  ϣ������
	public static void shellSort(int[] a){
		int length=a.length;
		int grp=length/2;
		while(grp>=1){
			for(int i=grp;i<length;i++){
				int temp=a[i];
				for(int j=i;j>=grp&&a[j-grp]>temp;j-=grp){
					a[j]=a[j-grp];
					a[j-grp]=temp;
				}
			}
		grp/=2;	
		}
	}    */
	/*    ������
	public static void heapSort(int[] arr){
		for(int i=arr.length/2-1;i>=0;i--){
			toHeap(arr,i,arr.length);
		}
		for(int j=arr.length;j>1;j--){
			swap(arr,0,j-1);
			toHeap(arr,0,j-1);
		}	
	}
	public static void toHeap(int[] arr,int n,int length){
		for(int k=n*2+1;k<length;k=k*2+1){
			if(k+1<length&&arr[k+1]<arr[k]){
				k=k+1;	
			}
			if(arr[k]<arr[n]){
				swap(arr,k,n);
				n=k;
			}else{
				break;
			}
		}	
	}
	public static void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}   */
	
	/* public static void preOrder(Node node){//��������ǵݹ�  ���������add�Ĳ�������pop���� �������������ջ�����Һ���
		Node node=node;
		Stack<Node> s=new Stack<Node>();
		List<Node> result=new ArrayList<Node>();
		while(s.size()!=0||node!=null){
			if(node!=null){
				result.add(node);
				s.push(node);
				node=node.left;
			}else{
				node=s.pop();
				node=node.right;
			}
	
			
			
		}
		

	}  */

}
