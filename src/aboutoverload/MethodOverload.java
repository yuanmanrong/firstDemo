package aboutoverload;

/*��ĿҪ�󣺶���һ�������Ƚ����������Ƿ����
�������ͷֱ�Ϊ����byte���ͣ�����short���ͣ�����int���ͣ�����long���ͣ�����main�����в���*/
public class MethodOverload {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;// �����еľֲ���������������û�й�ϵ
		System.out.println(isSame(a, b));
		System.out.println(isSame((short)a, (short)b));
		System.out.println(isSame(35, 30));
		System.out.println(isSame((long)13, (long)13));//�������صĺô��ǲ��ü���̫�෽�����ƣ��������Ƽ����÷�������
	}

	/*
	 * �������������������йأ��������� �������� ����������˳��
	 */
	/*
	 * ����ֵ��Boolean �������ƣ�isSame ������
	 */
	public static boolean isSame(byte a, byte b) {
		System.out.println("����byte�����ķ���ִ�У�");
		return a == b;
	}

	public static boolean isSame(int a, int b) {
		System.out.println("����int�����ķ���ִ�У�");
		return a == b;
	}

	public static boolean isSame(long a, long b) {
		System.out.println("����long�����ķ���ִ�У�");
		return a == b;
	}

	public static boolean isSame(short a, short b) {
		System.out.println("����short�����ķ���ִ�У�");
		return a == b;
	}
}
