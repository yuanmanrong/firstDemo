package aboutarray;

public class GetArray2 {
	public static void main(String[] args) {
		
		//��̬��ʼ���ķ���
		int[] arrayA = new int[3];
		System.out.println(arrayA);//�ڴ��ֵַ
		
		/*��̬��ʼ��Ԫ�ػ���һ��Ĭ��ֵ���������£�
		��������Ĭ��Ϊ0
		��������Ĭ��Ϊ0.0
		�ַ�����Ĭ��Ϊ'\u0000'(���ǲ��ɼ����ͣ�0000��16����)
		Boolean����Ĭ��Ϊfalse
		��������Ĭ��Ϊnull
		��̬��ʼ��Ҳ��Ĭ��ֵ��ֻ�����ǽ������ŵ����ݸ����˽��*/
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
