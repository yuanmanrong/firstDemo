package aboutoverload;
//�ڵ���������ʱ��println������ʵ���ǽ����˶����������͵�������ʽ������͵ü�������printintln��printdoubleln��printcharln�Ⱥܶ෽������
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
