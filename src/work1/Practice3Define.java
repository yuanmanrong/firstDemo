package work1;
/*����һ������Int����ӵķ���:
 ����ֵ���ͣ�int
 �������ƣ�sum
 �����б�:int a; int b  */
public class Practice3Define {
	public static void main(String[] args) {
		sum(2,3);//���������еĵ������ã�����ֵû���õ�
		System.out.println("*******************");
		System.out.println(sum(10,2));//���������еĴ�ӡ����
		System.out.println("*******************");
		int number=sum(2,3);//���������еĸ�ֵ����
		System.out.println(number);
		System.out.println("*******************");
		sumNoReturn(4,5);
	}
   public static int sum(int a,int b){
	   int result=a+b;
	   return result;//�з���ֵ����������ظ����ô�������12��
	   
   }
   public static void sumNoReturn(int a,int b){
	   int result=a+b;
	   System.out.println("�����:"+result);//û�з���ֵ�����ѽ�������κ��ˣ��Լ�ֱ�Ӵ�ӡ���
   }
}
