package day19;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class DemoException1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			try {
				int i = Integer.valueOf(str);
				System.out.println(Integer.toBinaryString(i));
			}
			catch(Exception e) {
				try{
					new BigInteger(str);
					System.out.println("����������������������һ������:");
				}
				catch(Exception e1) {
					try {
						new BigDecimal(str);
						System.out.println("����ΪС��������������һ������:");
					} catch (Exception e2) {
						System.out.println("���뺬�зǷ��ַ�������������һ������:");
					}
				}
			}
		}	
	}
}
