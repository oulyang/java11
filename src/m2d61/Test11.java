package m2d61;

public class Test11 {

	public static void main(String[] args) {

			Result ret3=divide(10,0);
			System.out.println(ret3);
		}
		

		public static Result divide(int a,int b) {
			try {
				int c=a/b;

				return Result.SUCCESS;
			}catch (Exception e) {

				return Result.FAIL;
			}
		}

	}

//ö�ٱ�������class�ļ���ö����һ�������������ͣ�ö����ÿ��ֵ���Կ�������
/*
 * �﷨��ʽ enum ö��������{
 * 			ö������,ö������,ö������;
 * 			}
 */
enum Result{
	SUCCESS,
	FAIL;
}
