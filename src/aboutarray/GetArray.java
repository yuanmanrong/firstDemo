package aboutarray;

public class GetArray {
	public static void main(String[] args) {
		
		int[] arrayA = { 10, 20, 30 };
		/*打印结果为：[I@6d1e7682   
		 因为直接打印数组名称，得到的是数组对应的内存地址哈希值。
		  "["代表数组类型，"I"代表int类型*/
		int len=arrayA.length;
		System.out.println(len);//获取数组的长度
		System.out.println(arrayA);
		
		/*访问数组元素格式
		 直接打印数组元素*/
		System.out.println(arrayA[1]);
		
		/*可以将数组中的某一个元素赋给变量*/
		int num=arrayA[2];
		System.out.println(num);
		
		
	}
}
