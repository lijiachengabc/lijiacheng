/*
�������{
	   {1},
	   {2��2},
	   {3,3,3}

}
*/

public class erweishuzu1{
	public static void main (String[] args) { 
		int a =10;
		int arr[][] = new int[a][];
		for(int i =0;i<arr.length;i++){
			arr[i]=new int[i+1];//ÿ��һά���鶨���С
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=i+1;
			}
		}
		System.out.println("=====��������������=====");
		for(int i =0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}






		}

}