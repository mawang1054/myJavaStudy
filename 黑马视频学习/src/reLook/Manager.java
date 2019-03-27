package reLook;

public class Manager extends Employee {
	private int bonus;

	public Manager() {
		super();
		this.bonus = 0;
	}

	public Manager(int id, String name, int age, int bonus) {
		super(id, name, age);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}
}
