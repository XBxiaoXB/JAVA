package ex0403;

public class Circie extends Shape{
	
	double a;
	double radius;

	
	public Circie(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		a = radius * radius *p;
		return a;	
	}
	
	public void display()
	{
		System.out.println("円形の面積: " + a);
		System.out.printf("半径 ＝%.1f \n" ,this.radius);
	}

}
