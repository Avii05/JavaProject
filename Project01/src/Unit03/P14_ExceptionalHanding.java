package Unit03;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	//exception handling
	//-->use of try and catch block
	//-->why try and catch block;
	//-->difference btw error exception
	//-->use of throw keyword
	//-->use of final
	/*file handling 
	1.read input from a file instead of console
	2.making a log of execution pattern
	3.multi threading
	*/
	//Java Program to Demonstrate Exception is Thrown
	//How the runTime System Searches Call-Stack
	//to Find Appropriate Exception Handler

	//Class
	//ExceptionThrown
	class ABCDE
	{
		void BasicException1()
		{
			//sensitive code
			int a = 100/0;
			System.out.println(a);
			System.out.println("Done!!");
		}
		
		void BasicException2()
		{
			try {
				
				//sensitive code
				int b=0;
				int a = 100/b;
				System.out.println(a);
				
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		//java.util.InputMismatchException
		void InputMismatchException()
		{
			Scanner ob = new Scanner (System.in);
			try 
			{	
				int a = ob.nextInt();
				System.out.println(a);
			}
			catch(InputMismatchException e)
			{
				e.getMessage();
				System.out.println("Input Mismatch!!");
			}
			ob.close();
		}
		
		void StackOverflow()
		{
			try {

				//sensitive code
				int a=1;
				while(a>0)
				{
					a++;
					System.out.print(a+" ");
				}
				System.out.println("Overflow!!");
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("Overflow!!");
			}
		}
		
		void IndexOutOfBoundException()
		{
			try {

				//sensitive code
				int a[] = {1,2,3,4,5};
				for(int i=0;i<10;i++)
				System.out.print(a[i]+" ");
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}


	public class P14_ExceptionalHanding {

		public static void main(String[] args) {

			//ABCDE obj = new ABCDE();
			//obj.BasicException1();
			//obj.BasicException2();
			//obj.InputMismatchException();
			//obj.StackOverflow();
			//obj.IndexOutOfBoundException();

		}

	}

