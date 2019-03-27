package day14;

import java.util.Calendar;
import java.util.Scanner;

public class DemoDate2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		if (day == 28) {
			System.out.println("Æ½Äê");
		}
		else {
			System.out.println("ÈòÄê");
		}
	}
}
