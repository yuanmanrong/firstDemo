package aboutarray;

public class ArrayLength {
	public static void main(String[] args) {
		
		//��ȡ����ĳ��ȣ�����һ�����������������ڼ䳤�Ȳ��ɸı�
		int[] arrayB = { 10, 20, 30, 40, 70, 44, 66, 34, 23 };
		int len = arrayB.length;
		System.out.println("����ĳ����ǣ�" + len);
		System.out.println("*********************************" );
		
		int[] arrayC=new int[3];//�ڶ��д��
		System.out.println(arrayC.length);
		arrayC=new int[5];//��һ�������飬��arrayC�ĵ�ֵַ�����˸ı䣬֮ǰ������ռ仹��
		System.out.println(arrayC.length);
		
		
		
	}
}
