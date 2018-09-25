package aboutarray;

/*2018-9-24基础练习*/

public class Day2Array {
	public static void main(String[] args) {
		
		/* 数组定义的基本格式 */
		int[] arrayA = new int[10];// 动态初始化，在创建数组的时候直接指定数据个数的多少
		int[] arrayB = new int[] { 10, 20, 30 };// 静态初始化，不直接指定数据的多少，而是直接将数据内容进行指定
		String[] arrayC = new String[] { "hello", "world", "java" };// 虽然没有长度，但可直接推算出来
		
		/*使用静态初始化时，格式还可以省略一下*/
		int[] arrayD= {10,20,30};
		/*静态初始化的格式可以拆分为两个步骤*/
		int arrayE[];
		arrayE=new int[] {10,20,30};
		/*动态初始化也可以拆分为两个步骤*/
		int arrayF[];
		arrayF=new int[10];
		
		System.out.println(arrayA);
		System.out.println(arrayB[1]);
		System.out.println(arrayC[1]);
		System.out.println(arrayD[2]);
		System.out.println(arrayE[2]);
		System.out.println(arrayF.length);
	}
}
