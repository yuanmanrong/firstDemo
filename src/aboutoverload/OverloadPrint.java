package aboutoverload;
//在调用输出语句时，println方法其实就是进行了多种数据类型的重载形式。否则就得记忆例如printintln，printdoubleln，printcharln等很多方法名。
public class OverloadPrint {
	public static void main(String[] args) {
		myPrint(100);
		myPrint("hello");
		myPrint(3.20);
	}
	public static void myPrint(int num) {
		System.out.println(num);
	}

	public static void myPrint(double num) {
		System.out.println(num);
	}

	public static void myPrint(char num) {
		System.out.println(num);
	}

	public static void myPrint(String str) {
		System.out.println(str);
	}

	public static void myPrint(boolean is) {
		System.out.println(is);
	}
}
