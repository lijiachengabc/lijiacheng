/*
随机生成10个整数（1-100的范围）保存在数组，
并倒序打印以及求平均值、最大值及最大值的下标，
并查找里面是否有8

*/

public class homework9231{
	public static void main (String[] args) { 
		int arr[] =new int [10];
		double num =0;
		int max=0;
		int index=-1;
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("======正序打印情况如下======");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
			num+=arr[i];
			if(max<arr[i]){
				max=arr[i];
				index=i;
			}
		}
		System.out.println("\n======倒序打印情况如下======");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n======各种值情况如下======");
		System.out.println("\n该数组的和为"+num);
		System.out.println("\n该数组平均值为"+num/arr.length);
		System.out.println("\n该数组最大值为"+max);
		System.out.println("\n该数组最大值的下标为"+index);


		//在数组中寻找是否有8
		int findNum =8;
		int index1 =-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==findNum){
				index1=i;
				System.out.println("该数组存在8，相对应的下标为" +index1);
				break;
			}
		}
		if(index1==-1){
			System.out.println("该数组不存在8，可惜没如果");
		}
	}
}	