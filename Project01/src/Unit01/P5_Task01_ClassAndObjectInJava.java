package Unit01;

public class P5_Task01_ClassAndObjectInJava {

	public static void main(String[] args) {
		
		ABC2 obj=new ABC2();
		obj.display2(); //called by object for method in class ABC2
		
		ABC2.display(); // called by class for static method

	}

}

class ABC2 {
	
	int a=10;
	static int b=10;
	
	static void display()
	{
		int b=10;
		b++;
		
		//System.out.println(a);
		System.out.println("Value of b="+b);
		
	}
	
	void display2() {
		
		System.out.println("Value of a="+a);
		
		//As a was a local variable so we can not access it outside the method
		//System.out.println(b);
	}
}
