/*
已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如
[10,12,45,90]，添加23后变成[10,12,23,45,90]

*/

public class homework923{
	public static void main (String[] args) { 
		int arr[] ={10,12,45,90};
		int insertNum = 23;
		int index = -1;
		//第一步，找到插入的索引值。
		for(int i =0;i<arr.length;i++){
			if(insertNum<=arr[i]){
				index = i;
				break;
			}
			if(index==-1){
				index=arr.length;//用index的值来表示遍历数组后没有i<arr.length的情况
			}
		}
		//第二步，定义新数组并将数据依次插入。
		int arrNew[] = new int[arr.length+1];
		for(int i=0,j=0;i<arrNew.length;i++){
			if(index != i){
				arrNew[i] =arr[j];
				j++;//i,j在这里代表新老数组的指针，逻辑是只有指针i的值不为插入值索引index值的时候，指针j才会和i一起增加。
			}else{
				arrNew[i]=insertNum;
			}
		}
		//第三步，将新数组导入旧数组中，然后输出数组。
		arr=arrNew;
		System.out.println("======新数组的情况如下所示======");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}










	}
}