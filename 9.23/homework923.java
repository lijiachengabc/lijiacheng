/*
��֪�и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ�����򣬱���
[10,12,45,90]�����23����[10,12,23,45,90]

*/

public class homework923{
	public static void main (String[] args) { 
		int arr[] ={10,12,45,90};
		int insertNum = 23;
		int index = -1;
		//��һ�����ҵ����������ֵ��
		for(int i =0;i<arr.length;i++){
			if(insertNum<=arr[i]){
				index = i;
				break;
			}
			if(index==-1){
				index=arr.length;//��index��ֵ����ʾ���������û��i<arr.length�����
			}
		}
		//�ڶ��������������鲢���������β��롣
		int arrNew[] = new int[arr.length+1];
		for(int i=0,j=0;i<arrNew.length;i++){
			if(index != i){
				arrNew[i] =arr[j];
				j++;//i,j������������������ָ�룬�߼���ֻ��ָ��i��ֵ��Ϊ����ֵ����indexֵ��ʱ��ָ��j�Ż��iһ�����ӡ�
			}else{
				arrNew[i]=insertNum;
			}
		}
		//���������������鵼��������У�Ȼ��������顣
		arr=arrNew;
		System.out.println("======����������������ʾ======");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}










	}
}