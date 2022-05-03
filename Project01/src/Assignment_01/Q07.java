package Assignment_01;

public class Q07 {
	
		public static void main(String[] agrs) {
			int j=0;
			Employee obj=new Employee();
			j++;
			Employee obj1=new Employee();
			j++;
			Employee obj2=new Employee();
			j++;
			Employee obj3=new Employee();
			j++;
			Employee obj4=new Employee();
			j++;
			Employee obj5=new Employee();
			j++;
			Employee obj6=new Employee();
			j++;
			Employee obj7=new Employee();
			j++;
			Employee obj8=new Employee();
			j++;
			Employee obj9=new Employee();
			j++;
			
			System.out.println("Number of object created="+j);
			
			obj.display();
			obj1.display();
			obj2.display();
			obj3.display();
			obj4.display();
			obj5.display();
			
			System.out.println("Number of calls made="+obj.i);
		}
	}

	class Employee{
		
		static int i=0;
		void display(){
			i++;
		    if(i==1)
			System.out.println(i+"st Call made");
			else if(i==2)
			System.out.println(i+"nd Call made");
			else if(i==3)
			System.out.println(i+"rd Call made");
			else
			System.out.println(i+"th Call made");
		}
	}

