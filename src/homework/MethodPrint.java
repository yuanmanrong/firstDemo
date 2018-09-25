package homework;
/*定义一个方法，用来打印指定次数的HelloWorld*/
public class MethodPrint {
	public static void main(String[] args) {
		printContent(6);//void类型的方法只使用单独调用
	}
	/*返回值：只进行打印，没有计算和结果需要返回
	方法名称：printContent
	参数：需要知道打印多少次 int*/
	public static void printContent(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println("Hello World!!!");
		}
	}

}
