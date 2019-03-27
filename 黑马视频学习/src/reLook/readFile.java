package reLook;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {
	public static void main(String[] args) throws IOException {
		method1();	
		System.out.println("------------------------");
		method2();
		
		final Employee ��ʼ��;
		Employee x = new Employee(1101,"����",23);
		��ʼ�� = x;
		System.out.println(��ʼ��);
		x.setName("������");
		System.out.println(��ʼ��);
	}

	private static void method2() throws IOException {
		Scanner in = new Scanner(Paths.get("in.txt"),"UTF-8");
		ArrayList<Employee> list = new ArrayList<>();
		while (in.hasNext()) {
			String str = in.nextLine();
			String[] strArr = str.split(" ");
			list.add(new Employee(Integer.valueOf(strArr[0]), strArr[1], Integer.valueOf(strArr[2])));
		}
		for (Employee i : list) {
			System.out.println(i);	
		}
	}

	private static void method1() throws IOException {
		Scanner in = new Scanner(Paths.get("in1.txt"),"UTF-8");
		int fileLength = Integer.valueOf(in.next());
		ArrayList<Employee> list = new ArrayList<>();
		for (int i = 0; i < fileLength; i++) {
			int id = in.nextInt();
			String name = in.next();
			int age = in.nextInt();
			list.add(new Employee(id, name, age));
		}
		for (Employee i : list) {
			System.out.println(i);
		}
	}
}
