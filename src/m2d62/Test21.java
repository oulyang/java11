package m2d62;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Test21 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("mb");
		try {
			m1();
		} catch (FileNotFoundException e) {//1.()内可以写父类型 2.catch可以写多个，具体异常具体处理 3.catch多个时从上到下从小到大原则
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("mo");
	}
	
	private static void m1() throws FileNotFoundException {
		System.out.println("m1b");
		m2();
		System.out.println("m1o");
	}
	private static void m2() throws FileNotFoundException {
		System.out.println("m2b");
		m3();
		System.out.println("m2o");
	}
	private static void m3() throws FileNotFoundException {
		new FileInputStream("D:\\应用\\虎牙.txt");
	}
}
