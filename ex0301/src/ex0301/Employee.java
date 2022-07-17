package ex0301;

public class Employee {
	String employee;
	String id;
	String name;
	int age;
	String section;
	
	public Employee(String getid,String getname,int getage,String getsection)
	{
		id = getid;
		name = getname;
		age =getage;
		section = getsection;
	}
	

	public void print()
	{
		System.out.println("従業員番号: " + id);
		System.out.println("名　　　前: " + name);
		System.out.println("年　　　齢: " + age);
		System.out.println("部　　　署: " + section);
		
	}

}
