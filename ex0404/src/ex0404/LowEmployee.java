package ex0404;

public class LowEmployee extends Employee{
	int b;
	public LowEmployee(String name, int salary) {
		super(name, salary);
	}
	
	public void introduce()
	{
		System.out.println("私は名前は"+ this.name + "です。");
		System.out.println("給料は" + b +"円");
		System.out.println("ブーナスは"+ this.salary + "です。" );

	
	}

	public int getBonus() {
		this.salary = 2 * this.salary;
		return this.salary;
	}

	public String getPost() {
		return null;

	}

	@Override
	public int getSalary() {
		b =this.salary;
		return b;

	}

}
