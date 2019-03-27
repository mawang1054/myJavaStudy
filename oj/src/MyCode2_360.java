import java.util.Scanner;

public class MyCode2_360 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int length = 0;
		while(sc.hasNext()) {
			length = sc.nextInt();
			f(length);
		}
	}
	
	public static void f(int length) {		
		int count = 0;
		for (int i = 1; i <= length; ++i) {		
			if(numCount(i))
				++count;
		}
		System.out.println(count);
	}
	
	public static boolean numCount(int num) {
		while(num != 0) {
			if (num % 10 > 1) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}
}
