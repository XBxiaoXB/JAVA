package ex0404;

public abstract class Employee implements IEmployee{
	String name = "";
	int salary = 0;
	
	public Employee(String name,int salary)
	{
		 this.name = name;
		 this.salary = salary;
	}
	
	public void introduce()
	{
		System.out.println("私は名前は"+ this.name + "です。");
		System.out.println("給料は" + this.salary +"円");
		System.out.println("ブーナスは"+ salary + "です。" );
	}
	public abstract int getSalary();
	public abstract int getBonus();
	public abstract String getPost();

}
