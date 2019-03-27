package day17;

public class Student /*implements Comparable<Student>*/ {
	private String name;
	private double chinese;
	private double math;
	private double english;
	private double total;
	
	public Student() {
		super();
	}

	public Student(String name, double chinese, double math, double english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.total = chinese + math + english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getChinese() {
		return chinese;
	}

	public void setChinese(double chinese) {
		this.chinese = chinese;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}
	
	public void setTotal() {
		this.total = this.chinese + this.math + this.english;
	}
	
	public double getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", chinese=" + chinese + ", math=" + math + ", english=" + english + ", total="
				+ total + "]";
	}

//	@Override
//	public int compareTo(Student o) {
//		double num = o.total - this.total;
//		return (int) (num != 0.0 ? num : this.name.compareTo(o.name));
//	}
	
	
}
