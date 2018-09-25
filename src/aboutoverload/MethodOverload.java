package aboutoverload;

/*题目要求：定义一个方法比较两个数据是否相等
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中测试*/
public class MethodOverload {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;// 括号中的局部变量，所以重名没有关系
		System.out.println(isSame(a, b));
		System.out.println(isSame((short)a, (short)b));
		System.out.println(isSame(35, 30));
		System.out.println(isSame((long)13, (long)13));//方法重载的好处是不用记忆太多方法名称，功能类似即可用方法重载
	}

	/*
	 * 方法重载与下列因素有关：参数个数 参数类型 参数多类型顺序
	 */
	/*
	 * 返回值：Boolean 方法名称：isSame 参数：
	 */
	public static boolean isSame(byte a, byte b) {
		System.out.println("两个byte参数的方法执行！");
		return a == b;
	}

	public static boolean isSame(int a, int b) {
		System.out.println("两个int参数的方法执行！");
		return a == b;
	}

	public static boolean isSame(long a, long b) {
		System.out.println("两个long参数的方法执行！");
		return a == b;
	}

	public static boolean isSame(short a, short b) {
		System.out.println("两个short参数的方法执行！");
		return a == b;
	}
}
