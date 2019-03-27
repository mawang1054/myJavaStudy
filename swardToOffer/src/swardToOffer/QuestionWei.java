package swardToOffer;

public class QuestionWei {
	public static void main(String[] args) {
		System.out.println(wei26to10("AAA"));
	}
	
	public static int wei26to10(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); ++i) {
			int x = str.charAt(i) - 'A' + 1;
			sum += (int)Math.pow(26,i) * x;
		}
		return sum;
	}
}
