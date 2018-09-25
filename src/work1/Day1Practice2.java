package work1;
//简单的方法定义和调用
public class Day1Practice2 {
	public static void main(String[] args) {
		printMethod();//方法调用
	}

	public static void printMethod() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print("ha");//矩形输出框
				
			}
			System.out.println();//简单的方法定义：方法定义无先后顺序，使用方法必须调用
		}
	}
}
