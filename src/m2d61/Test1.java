package m2d61;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int ret1=divide(10,2);
		System.out.println(ret1);
		
		int ret2=divide(10,0);
		System.out.println(ret2);
		*/
		boolean ret3=divide(10,0);
		System.out.println(ret3);
	}
	
	//����ֵӦ����boolean����
	/*
	public static int divide(int a,int b) {
		try {
			int c=a/b;
			//ִ�е��˴���ʾ����û�����쳣
			return 1;
		}catch (Exception e) {
			//ִ�е��˴���ʾ�����쳣
			return 0;
		}
		*/
	public static boolean divide(int a,int b) {
		try {
			int c=a/b;
			//ִ�е��˴���ʾ����û�����쳣
			return true;
		}catch (Exception e) {
			//ִ�е��˴���ʾ�����쳣
			return false;
		}
	}

}
