package Unit01;

public class P3_Task01_VariablesAndDataTypesInJava {
	
		static int q=11;
		int p=10;

		public static void main(String[] args) {
	//Valid Declaration
			int b,c;
			float pi;
			double d;
			char e;
			int a=5; //Local Variable
			System.out.println("This is Dislay Method!");
			System.out.println(a);
            
		
			/*
			 *double f; //8bytes =64bits/slots int i =10; // 4bytes =32 bits/ 
			 * = i;//Type Conversion System.out.println(f);
			 * 
			 *double g = 10; //64 int j; //32 j =(int)g;
			 */
			double f;//64 slots
			int i =10;//32 slots
			f=i;//Type Conversion
			System.out.println(f);
			
			double g =10;//64
			int j;//32
			j=(int)g; // Type Casting
			//32 bits =64 bits
			System.out.println(i);
			System.out.println(j);
		}
	}
    


