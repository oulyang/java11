package m2d62;
/**程序执行过程中出现不正常的情况，该种情况称为 异常
 * 异常在java中以类的方式存在
 * 所有异常都发生在运行阶段，因为异常的发生都是new异常对象
 * 
 * 编译时异常，又被称为受检异常或受控异常发生概率高，一般会进行预处理
 * 运行时异常 未受检异常  非受控异常
 * 
 * 对异常的处理方式：1 在方法声明的位置上，使用throws关键字（异常上抛）
 * 					2 使用try...catch语句进行异常的捕捉
 * 
 * java中异常如果一直上抛，最终抛给main方法，main继续抛给JVM，最后程序终止执行
 * @author yyds
 *
 */
public class Test2 {
 
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=0;
		int c=a/b;//JVM会new异常对象：new ArithmeticException("/ by zero")
		System.out.println(c);
	}
	*/
	public static void main(String[] args) {
	/*
	//第一种处理方式
	public static void main(String[] args) throws ClassNotFoundException{
	*/
		//通过“异常类”实例化“异常对象”
		NumberFormatException nfe=new NumberFormatException("数字格式化异常");
		System.out.println(nfe);
		
		NullPointerException npe=new NullPointerException("空指针异常");
		System.out.println(npe);
		
		//因为dosome方法声明位置上使用了 throws ClassNotFoundException，而ClassNotFoundException是编译时异常，必须编写代码时处理
		//第二种处理方式
		/*
		try {
			dosome();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
		
	}

	public static void dosome() throws ClassNotFoundException{
		System.out.println("hello");
	}

}
