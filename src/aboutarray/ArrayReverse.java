package aboutarray;
/*����Ԫ�ط�ת
 ��ʵ���ǶԳ�λ��Ԫ�صĽ���*/
public class ArrayReverse {
	public static void main(String[] args) {
		
/*��ʦ���ķ�����
 
��β�ֱ������min��max,��min����max��ʱ��ֹͣ�Ƚ�
for(int min=0,max=arrayA.length-1;min<max;min++,max--){
int t=arrarA[min];
arrarA[min]=arrarA[max];
arrarA[max]=t;

}*/
		int[] arrayA = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < arrayA.length / 2; i++) {
			int t;
			t = arrayA[i];
			arrayA[i] = arrayA[arrayA.length - i - 1];
			arrayA[arrayA.length - i - 1] = t;
		}
		System.out.print("��ת֮����Ϊ��");
		for (int j = 0; j < arrayA.length; j++) {
			System.out.print(arrayA[j] + ",");
		}
	}
}
