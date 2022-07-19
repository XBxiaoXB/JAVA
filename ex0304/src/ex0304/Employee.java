package ex0304;

public class Employee {
	String employee;
	int id;
	String name;
	int age;
	String section;
	String manger;
	int numStaff;

	public void print ()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(section);
		System.out.println(numStaff);
	}

	public void work()
	{
		System.out.println("私は働きます。");
	}
	public void work(int a)
	{
		System.out.println("私は一日に" + a +"時間働きます。");
	}
	public void work(String b)
	{
		System.out.println("私は" + b +"働きます。");
	}
	public int work(int[] hour)
	{
		int c = hour[0]+hour[1]+hour[2]+hour[3]+hour[4];
		return c;
	}
}
