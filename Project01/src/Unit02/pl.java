package Unit02;

public class pl {
  
	public static void main(String[] agrs) {
	Thre obj=new Thre();
	
		
   }
	
}

class on{
	
	on(){
		System.out.println("Default 1");
	}
	on(int x){
		System.out.println("Parametirezed 1");
	}
}

class To extends on{
	
	/*To(){
		
		System.out.println("Default 2");
	}*/
	To(int x){
		
		System.out.println("Parametirezed 2");
	}
}

class Thre extends To{
	
	Thre(){	
		super(1);
		System.out.println("Default 3");
	}
	Thre(int x){
		super(1);
		System.out.println("Parametirezed 3");
	}
}