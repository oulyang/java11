package m2d62;
/**����ִ�й����г��ֲ���������������������Ϊ �쳣
 * �쳣��java������ķ�ʽ����
 * �����쳣�����������н׶Σ���Ϊ�쳣�ķ�������new�쳣����
 * 
 * ����ʱ�쳣���ֱ���Ϊ�ܼ��쳣���ܿ��쳣�������ʸߣ�һ������Ԥ����
 * ����ʱ�쳣 δ�ܼ��쳣  ���ܿ��쳣
 * 
 * ���쳣�Ĵ���ʽ��1 �ڷ���������λ���ϣ�ʹ��throws�ؼ��֣��쳣���ף�
 * 					2 ʹ��try...catch�������쳣�Ĳ�׽
 * 
 * java���쳣���һֱ���ף������׸�main������main�����׸�JVM����������ִֹ��
 * @author yyds
 *
 */
public class Test2 {
 
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=0;
		int c=a/b;//JVM��new�쳣����new ArithmeticException("/ by zero")
		System.out.println(c);
	}
	*/
	public static void main(String[] args) {
	/*
	//��һ�ִ���ʽ
	public static void main(String[] args) throws ClassNotFoundException{
	*/
		//ͨ�����쳣�ࡱʵ�������쳣����
		NumberFormatException nfe=new NumberFormatException("���ָ�ʽ���쳣");
		System.out.println(nfe);
		
		NullPointerException npe=new NullPointerException("��ָ���쳣");
		System.out.println(npe);
		
		//��Ϊdosome��������λ����ʹ���� throws ClassNotFoundException����ClassNotFoundException�Ǳ���ʱ�쳣�������д����ʱ����
		//�ڶ��ִ���ʽ
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
