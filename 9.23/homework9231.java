/*
�������10��������1-100�ķ�Χ�����������飬
�������ӡ�Լ���ƽ��ֵ�����ֵ�����ֵ���±꣬
�����������Ƿ���8

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
		System.out.println("======�����ӡ�������======");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
			num+=arr[i];
			if(max<arr[i]){
				max=arr[i];
				index=i;
			}
		}
		System.out.println("\n======�����ӡ�������======");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n======����ֵ�������======");
		System.out.println("\n������ĺ�Ϊ"+num);
		System.out.println("\n������ƽ��ֵΪ"+num/arr.length);
		System.out.println("\n���������ֵΪ"+max);
		System.out.println("\n���������ֵ���±�Ϊ"+index);


		//��������Ѱ���Ƿ���8
		int findNum =8;
		int index1 =-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==findNum){
				index1=i;
				System.out.println("���������8�����Ӧ���±�Ϊ" +index1);
				break;
			}
		}
		if(index1==-1){
			System.out.println("�����鲻����8����ϧû���");
		}
	}
}	