package ex0403;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Square squ = new Square(5.0, 5.0);
		Triangle tri = new Triangle(5.0, 5.0);
		Circie cir = new Circie(5.0);
		
		double a = squ.getArea();
		double b =tri.getArea();
		double c =cir.getArea();
		
		squ.display();
		tri.display();
		cir.display();

	}

}
