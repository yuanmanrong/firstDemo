package homework;
/*����һ�����������1-100֮�����еĺ�*/
public class MethodSum {
 public static void main(String[] args) {
	 int result=allSum();
	 System.out.println("����ǣ�"+result);//���� System.out.println("����ǣ�"+allSum());
 }
 /*����ֵ��int
 �������ƣ�allSum
 ��������Ŀ��֪1-100������Ҫ�κβ������ɶ������*/
 public static int allSum(){
	 int sum=0;
	 for(int i=1;i<=100;i++) {
		 sum=sum+i;
	 }
	 return sum;//�з���ֵ������Ҫд�ϡ� return ����ֵ���� �Ҹ÷���ֵ����ͷ����ķ�������һ��
 }
}
