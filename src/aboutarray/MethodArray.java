package aboutarray;

/*数组作为方法参数，
当调用方法的时候，向方法的小括号进行传参，传递进去的实际是数组的地址值*/

public class MethodArray {
	public static void main(String[] args) {
		int[] arrayA= {10,20,30,40};
		printArray(arrayA);//使用数组方法，方便数组的调用，直接就打印出来了
		System.out.println(arrayA);//数组的地址
	}
/*	三要素：
	返回值：只需要打印不需要计算，所以void
	方法名称：printArray
	参数列表：必须给数组才能打印，任何数据类型都可以作为方法参数，所以数组也可以作为参数*/
	public static void printArray(int[] arrayA) {
		System.out.println(arrayA);//收到的参数是地址值，通过地址去找数组内容
		for(int i=0;i<arrayA.length;i++) {
	   System.out.println(arrayA[i]);
		}
	}

}
