package aboutarray;

/*�����ķ���ֵ����������
һ������������0,1���������������ֻ����0��1������ֵ
���ϣ��һ�����������Ķ��������ݽ��з��أ�ʹ��һ��������Ϊ����ֵ�������*/
public class MethodReturnArray {
	public static void main(String[] args) {
		int[] result=caculate(1,2,3);
		System.out.println("�ܺ��ǣ�"+result[0]);
		System.out.println("ƽ�����ǣ�"+result[1]);
		System.out.println(result);//�������յ�Ҳ������ĵ�ֵַ
	}
	public static int[] caculate(int a,int b,int c){
		int sum=a+b+c;
		int avg=sum/3;
		int[] arrayA=new int[2];
	/*	Ҳ��������д��int[] arrayA= {sum,avg};*/
		arrayA[0]=sum;
		arrayA[1]=avg;
		System.out.println(arrayA);//���鷵�ص��ǵ�ֵַ
		return arrayA;
	}

}
