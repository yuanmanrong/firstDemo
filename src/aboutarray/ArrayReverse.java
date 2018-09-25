package aboutarray;
/*数组元素反转
 其实就是对称位置元素的交换*/
public class ArrayReverse {
	public static void main(String[] args) {
		
/*老师讲的方法：
 
首尾分别定义变量min和max,当min大于max的时候停止比较
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
		System.out.print("倒转之后结果为：");
		for (int j = 0; j < arrayA.length; j++) {
			System.out.print(arrayA[j] + ",");
		}
	}
}
