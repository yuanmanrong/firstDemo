package aboutarray;

public class GetArray {
	public static void main(String[] args) {
		
		int[] arrayA = { 10, 20, 30 };
		/*��ӡ���Ϊ��[I@6d1e7682   
		 ��Ϊֱ�Ӵ�ӡ�������ƣ��õ����������Ӧ���ڴ��ַ��ϣֵ��
		  "["�����������ͣ�"I"����int����*/
		int len=arrayA.length;
		System.out.println(len);//��ȡ����ĳ���
		System.out.println(arrayA);
		
		/*��������Ԫ�ظ�ʽ
		 ֱ�Ӵ�ӡ����Ԫ��*/
		System.out.println(arrayA[1]);
		
		/*���Խ������е�ĳһ��Ԫ�ظ�������*/
		int num=arrayA[2];
		System.out.println(num);
		
		
	}
}
