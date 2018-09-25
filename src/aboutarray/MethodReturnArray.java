package aboutarray;

/*方法的返回值可以是数组
一个方法可以有0,1，多个参数，但是只能有0或1个返回值
如果希望一个方法产生的多个结果数据进行返回，使用一个数组作为返回值结果即可*/
public class MethodReturnArray {
	public static void main(String[] args) {
		int[] result=caculate(1,2,3);
		System.out.println("总和是："+result[0]);
		System.out.println("平均数是："+result[1]);
		System.out.println(result);//方法接收的也是数组的地址值
	}
	public static int[] caculate(int a,int b,int c){
		int sum=a+b+c;
		int avg=sum/3;
		int[] arrayA=new int[2];
	/*	也可以这样写：int[] arrayA= {sum,avg};*/
		arrayA[0]=sum;
		arrayA[1]=avg;
		System.out.println(arrayA);//数组返回的是地址值
		return arrayA;
	}

}
