package m2d62;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Test21 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("mb");
		try {
			m1();
		} catch (FileNotFoundException e) {//1.()�ڿ���д������ 2.catch����д����������쳣���崦�� 3.catch���ʱ���ϵ��´�С����ԭ��
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
		new FileInputStream("D:\\Ӧ��\\����.txt");
	}
}
