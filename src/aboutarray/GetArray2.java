package aboutarray;

public class GetArray2 {
	public static void main(String[] args) {
		
		//动态初始化的访问
		int[] arrayA = new int[3];
		System.out.println(arrayA);//内存地址值
		
		/*动态初始化元素会有一个默认值，规则如下：
		整数类型默认为0
		浮点类型默认为0.0
		字符类型默认为'\u0000'(这是不可见类型，0000是16进制)
		Boolean类型默认为false
		引用类型默认为null
		静态初始化也有默认值，只不过是将大括号的内容赋给了结果*/
		System.out.println(arrayA[0]);
		System.out.println(arrayA[1]);
		System.out.println(arrayA[2]);
		
		System.out.println("********************");
		
		arrayA[1]=100;
		System.out.println(arrayA[0]);
		System.out.println(arrayA[1]);
		System.out.println(arrayA[2]);
	}
}
