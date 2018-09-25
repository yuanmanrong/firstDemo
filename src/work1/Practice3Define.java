package work1;
/*定义一个两个Int数相加的方法:
 返回值类型：int
 方法名称：sum
 参数列表:int a; int b  */
public class Practice3Define {
	public static void main(String[] args) {
		sum(2,3);//方法调用中的单独调用，返回值没有用到
		System.out.println("*******************");
		System.out.println(sum(10,2));//方法调用中的打印调用
		System.out.println("*******************");
		int number=sum(2,3);//方法调用中的赋值调用
		System.out.println(number);
		System.out.println("*******************");
		sumNoReturn(4,5);
	}
   public static int sum(int a,int b){
	   int result=a+b;
	   return result;//有返回值，将结果返回给调用处，即第12行
	   
   }
   public static void sumNoReturn(int a,int b){
	   int result=a+b;
	   System.out.println("结果是:"+result);//没有返回值，不把结果告诉任何人，自己直接打印输出
   }
}
