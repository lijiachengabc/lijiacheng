// ����{1��2��3��4��5}��Ҫ�󽫸����������������ʾ�û��Ƿ����������
// ÿ����������Ǹ�Ԫ�أ���ֻʣ�����һ��Ԫ��ʱ����ʾ�����������ˡ�
import java.util.Scanner;
public class shuzuSJ{
	public static void main (String[] args) {
		int a[] = {1,2,3,4,5};
		int l = a.length;
		Scanner myScanner = new Scanner(System.in);//�����������жϣ���do whileѭ��
		do{
			int b[] = new int[l-1];
			for(int i = 0;i<l-1;i++){
				b[i] = a[i];
			}
			l--;
			a=b;
			System.out.println("���������������");
			for(int i = 0;i<l;i++){
				System.out.print(a[i] + " ");
			}
			System.out.println("�Ƿ����������Y/N?");
			char c = myScanner.next().charAt(0);
			if(c=='N'){
				break;
			}else if(c=='Y' && l==1) {
				System.out.println("�����޷���������");
				break;
			}

		}while(true);













		}
}