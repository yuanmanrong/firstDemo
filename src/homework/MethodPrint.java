package homework;
/*����һ��������������ӡָ��������HelloWorld*/
public class MethodPrint {
	public static void main(String[] args) {
		printContent(6);//void���͵ķ���ֻʹ�õ�������
	}
	/*����ֵ��ֻ���д�ӡ��û�м���ͽ����Ҫ����
	�������ƣ�printContent
	��������Ҫ֪����ӡ���ٴ� int*/
	public static void printContent(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println("Hello World!!!");
		}
	}

}
