// 数组{1，2，3，4，5}，要求将该数组进行缩减，提示用户是否进行缩减，
// 每次缩减最后那个元素，当只剩下最后一个元素时，提示不能在缩减了。
import java.util.Scanner;
public class shuzuSJ{
	public static void main (String[] args) {
		int a[] = {1,2,3,4,5};
		int l = a.length;
		Scanner myScanner = new Scanner(System.in);//先缩减，后判断，用do while循环
		do{
			int b[] = new int[l-1];
			for(int i = 0;i<l-1;i++){
				b[i] = a[i];
			}
			l--;
			a=b;
			System.out.println("现在数组情况如下");
			for(int i = 0;i<l;i++){
				System.out.print(a[i] + " ");
			}
			System.out.println("是否继续缩减，Y/N?");
			char c = myScanner.next().charAt(0);
			if(c=='N'){
				break;
			}else if(c=='Y' && l==1) {
				System.out.println("数组无法继续缩减");
				break;
			}

		}while(true);













		}
}