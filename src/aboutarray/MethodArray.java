package aboutarray;

/*������Ϊ����������
�����÷�����ʱ���򷽷���С���Ž��д��Σ����ݽ�ȥ��ʵ��������ĵ�ֵַ*/

public class MethodArray {
	public static void main(String[] args) {
		int[] arrayA= {10,20,30,40};
		printArray(arrayA);//ʹ�����鷽������������ĵ��ã�ֱ�Ӿʹ�ӡ������
		System.out.println(arrayA);//����ĵ�ַ
	}
/*	��Ҫ�أ�
	����ֵ��ֻ��Ҫ��ӡ����Ҫ���㣬����void
	�������ƣ�printArray
	�����б������������ܴ�ӡ���κ��������Ͷ�������Ϊ������������������Ҳ������Ϊ����*/
	public static void printArray(int[] arrayA) {
		System.out.println(arrayA);//�յ��Ĳ����ǵ�ֵַ��ͨ����ַȥ����������
		for(int i=0;i<arrayA.length;i++) {
	   System.out.println(arrayA[i]);
		}
	}

}
