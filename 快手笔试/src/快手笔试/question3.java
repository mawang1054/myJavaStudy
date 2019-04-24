package 快手笔试;

import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int number = sc.nextInt();
			int count = 0;
			int flag = 1;
			while (flag != 0) {
				if ((number & flag) != 0) {
					count++;
				}
			flag = flag << 1;
			}
			System.out.println(count);
		}
    }
}
