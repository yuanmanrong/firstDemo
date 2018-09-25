package homework;
/*定义一个方法，求出1-100之间所有的和*/
public class MethodSum {
 public static void main(String[] args) {
	 int result=allSum();
	 System.out.println("结果是："+result);//或者 System.out.println("结果是："+allSum());
 }
 /*返回值：int
 方法名称：allSum
 参数：题目已知1-100，不需要任何参数即可独立完成*/
 public static int allSum(){
	 int sum=0;
	 for(int i=1;i<=100;i++) {
		 sum=sum+i;
	 }
	 return sum;//有返回值，必须要写上“ return 返回值；” 且该返回值必须和方法的返回类型一致
 }
}
