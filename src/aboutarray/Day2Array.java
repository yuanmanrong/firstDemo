package aboutarray;

/*2018-9-24������ϰ*/

public class Day2Array {
	public static void main(String[] args) {
		
		/* ���鶨��Ļ�����ʽ */
		int[] arrayA = new int[10];// ��̬��ʼ�����ڴ��������ʱ��ֱ��ָ�����ݸ����Ķ���
		int[] arrayB = new int[] { 10, 20, 30 };// ��̬��ʼ������ֱ��ָ�����ݵĶ��٣�����ֱ�ӽ��������ݽ���ָ��
		String[] arrayC = new String[] { "hello", "world", "java" };// ��Ȼû�г��ȣ�����ֱ���������
		
		/*ʹ�þ�̬��ʼ��ʱ����ʽ������ʡ��һ��*/
		int[] arrayD= {10,20,30};
		/*��̬��ʼ���ĸ�ʽ���Բ��Ϊ��������*/
		int arrayE[];
		arrayE=new int[] {10,20,30};
		/*��̬��ʼ��Ҳ���Բ��Ϊ��������*/
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
