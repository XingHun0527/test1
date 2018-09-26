public class Mppx  {
	//冒泡排序
	public static void main(String[] args) {
	
		int[] arr=new int[]{20,23,45,56,88,36,28,96};
		for(int i=0;i<arr.length-1;i++){//最后一个数不用比 i:趟数
			for(int j=0;j<arr.length-i-1;j++){
				//在i的前提下，最后已经排出来的数不用比  j:循环的次数
				if(arr[j]>arr[j+1]){
					int aa=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=aa;
				
		//		System.out.print(aa);
				}
			
			}
		}
		for(int w=0;w<arr.length;w++){
			
			System.out.println(arr[w]);
			}

	
	}
}




=========================================================
public class Xzpx{
	//选择排序
	public static void main(String[] args) {
	int[] arr=new int[]{20,23,45,56,88,36,28,96};
	for(int i=0;i<arr.length-1;i++){
		int k=i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[j]>arr[k]){
				k=j;	
				}
			}
		}
		for(int w=0;w<arr.length;w++){
			
			System.out.println(arr[w]);
	
	}

	
		//System.out.println("Hello World!");
	}
}
