package swardToOffer;

public class Question15 {

	public static void main(String[] args) {
		System.out.println(solution1(-9));
		System.out.println(solution2(-9));
		System.out.println(solution3(-9));
		System.out.println(solution4(-9));
	}

	public static int solution1(int n) {
		String str = Integer.toBinaryString(n);
		System.out.println(str);
		int count = 0;
		for(int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) == '1')
				++count;
		}
		return count;
	}
	
	public static int solution2(int n) {
		int count = 0;
		while(n != 0) {
			if ((n & 1) == 1)
				++count;
			n = n >>> 1;//此处用>>的话,负数将陷入死循环
		}
		return count;
	}
	
	public static int solution3(int n) {
		int count = 0;
		int flag = 1;
		while(flag != 0) {
			if ((n & flag) != 0)//此处注意,不再是非零&flag就为1了
				++count;
			flag = flag << 1;
		}
		return count;
	}
	
	public static int solution4(int n) {
		int count = 0;
		while(n != 0) {
			n = n & (n - 1);
			++count;
		}
		return count;
	}
}
