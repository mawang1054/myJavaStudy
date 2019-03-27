package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				double num = o1.getTotal() - o2.getTotal();
				return (int) (num != 0.0 ? num : o2.getName().compareTo(o1.getName()));
			}
			
		});
		for (int i = 0; i < 2; ++i) {
			Student x = new Student();
			x.setName(sc.next());
			x.setChinese(Double.valueOf(sc.next()));
			x.setMath(Double.valueOf(sc.next()));
			x.setEnglish(Double.valueOf(sc.next()));
			x.setTotal();
			ts.add(x);
		}
		for (Student student : ts) {
			System.out.println(student);
		}
	}
}
