package ex0404;

public class HighEmployee extends Employee{

	int b;
	public HighEmployee(String name, int salary) {
		super(name, salary);
	
	}
	
	public void introduce()
	{
		System.out.println("私は名前は"+ this.name + "です。");
		System.out.println("給料は" + b +"円");
		System.out.println("ブーナスは"+ this.salary + "です。" );

	
	}

	public int getBonus() {
		this.salary = 5 * this.salary;
  		return this.salary;
	}

	public String getPost() {
		return null;

	}


	public int getSalary() {
		b =this.salary;
		return b;
	}

}
