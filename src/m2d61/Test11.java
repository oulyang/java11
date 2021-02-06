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

//枚举编译后产生class文件，枚举是一种引用数据类型，枚举中每个值可以看作常量
/*
 * 语法格式 enum 枚举类型名{
 * 			枚举类型,枚举类型,枚举类型;
 * 			}
 */
enum Result{
	SUCCESS,
	FAIL;
}
