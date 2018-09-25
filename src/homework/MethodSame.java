package homework;
/*定义一个方法，来判断两个数字是否相同*/
public class MethodSame {
 public static void main(String[] args) {
	 System.out.println(ifSame(10,10));//打印调用ifSame（）方法
	 System.out.println(ifSame(10,20));
 }
 /*定义方法时明确三要素
  返回值类型：boolean
  方法名称:ifSame
  参数列表:int a ,int b
  */
 public static  boolean ifSame(int a,int b){
	 boolean same;
	 
	/*方法一：
	  if(a==b) {
		 same=true;
	 }else {
		 same=false;
	 }*/
	 
	//方法二：same=a==b?true:false;
	 
	 return a==b;//此方法最简单
	 
	 /*方法三：same=a==b;
	return same;*/
 }
}
