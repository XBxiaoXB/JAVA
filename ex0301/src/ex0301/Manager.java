package ex0301;

public class Manager extends Employee{

	int numStaff ;
	public Manager(String getid, String getname, int getage, String getsection,int numStaff) {
		super(getid, getname, getage, getsection);
		this.numStaff =numStaff;
		
		super.print();
		System.out.println("スタッフ数: " + numStaff);

		
	}
	

	
	

}
