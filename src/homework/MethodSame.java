package homework;
/*����һ�����������ж����������Ƿ���ͬ*/
public class MethodSame {
 public static void main(String[] args) {
	 System.out.println(ifSame(10,10));//��ӡ����ifSame��������
	 System.out.println(ifSame(10,20));
 }
 /*���巽��ʱ��ȷ��Ҫ��
  ����ֵ���ͣ�boolean
  ��������:ifSame
  �����б�:int a ,int b
  */
 public static  boolean ifSame(int a,int b){
	 boolean same;
	 
	/*����һ��
	  if(a==b) {
		 same=true;
	 }else {
		 same=false;
	 }*/
	 
	//��������same=a==b?true:false;
	 
	 return a==b;//�˷������
	 
	 /*��������same=a==b;
	return same;*/
 }
}
