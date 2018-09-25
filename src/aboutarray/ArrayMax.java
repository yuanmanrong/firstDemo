package aboutarray;

/*求出数组中的最大值*/
public class ArrayMax {
	public static void main(String[] args) {
		/*
		 * 自己写的 int[] arrayA={29,40,3,7,6,55,23,12}; for(int i=0;i<arrayA.length-1;i++)
		 * { if(arrayA[i]>arrayA[i+1]) { arrayA[i+1]=arrayA[i]; } }
		 * 
		 * System.out.println("最大值是："+arrayA[arrayA.length-1]);
		 */

//此方法更简单，求最小值同理
		int[] arrayA = { 29, 40, 3, 7, 6, 55, 23, 12 };
		int max = arrayA[0];
		for (int i = 1; i < arrayA.length; i++) {
			if (arrayA[i] > max) {
				max = arrayA[i];
			}
		}
		System.out.println("最大值是：" + max);
	}

}
