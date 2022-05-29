package Unit03;

import java.util.Scanner;

public class P16_MultiThreading {

	public static void main(String[] args) {
	  /*C1 obj1=new C1();
        C2 obj2=new C2();
        
        obj1.show1();
        obj2.show2();*/
	    // Will not execute till show1 is not executed i.e until we enter the value of 'r'
        
		//to achieve concurrency by creating thread 
		Thread t1=new Thread(new T1(),"T1");// Map the Thread with the class T1 
		Thread t2=new Thread(new T2(),"T2");//"T2" is a String
		Thread t3=new Thread(new T3(),"T3");
		
		t1.start(); // starting Thread
		t2.start();
		t3.start();
		
	}

}

//Sequential Execution in Class C1 and C2

class C1{
	
	void show1() {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		System.out.println("Value of r= "+r);
		System.out.println("Done with the show1()!");
		//obj1.close();
	}
}

class C2{
	
	void show2() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Hey 2");
		}
	}
}

class T1 extends Thread{ //User-define Thread
	
	public void run() { // Internal method of thread called by start
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		System.out.println("Value of r= "+r);
	}
}

class T2 extends Thread{ //User-define Thread
	
	public void run() { 
		for(int i=0;i<10;i++)
		{
			System.out.println("Hey 2");
		}
	}
}

class T3 extends Thread{ //User-define Thread
	
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Hey 3");
			System.out.println(Thread.currentThread().getName());
		}
	}
}