import java.util.Scanner;

public class MyCode1_360 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		while(sc.hasNext()) {
			str += sc.next();
			if (str.length() == 9) {
				jieguo(str);
				str = new String();
			}
		}
	}
	
	public static void jieguo(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String strf = sb.toString();
		if(strf.equals(str))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
