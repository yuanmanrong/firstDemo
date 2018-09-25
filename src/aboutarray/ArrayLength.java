package aboutarray;

public class ArrayLength {
	public static void main(String[] args) {
		
		//获取数组的长度，数组一旦创建，程序运行期间长度不可改变
		int[] arrayB = { 10, 20, 30, 40, 70, 44, 66, 34, 23 };
		int len = arrayB.length;
		System.out.println("数组的长度是：" + len);
		System.out.println("*********************************" );
		
		int[] arrayC=new int[3];//在堆中存放
		System.out.println(arrayC.length);
		arrayC=new int[5];//是一个新数组，给arrayC的地址值发生了改变，之前的数组空间还在
		System.out.println(arrayC.length);
		
		
		
	}
}
