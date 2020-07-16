package classes;

public class Static_vriable1
{

	public static void main(String[] args) 
	{
		
		Sani obj=new Sani();
		Sani obj1=new Sani();
		
		obj.mark=300;
		obj1.mark=200;
	
		System.out.println("obj Mark ="+obj.mark);
		System.out.println("obj Mark1 ="+obj1.mark);
		

	}

}

class Sani
{
	static int mark;         //  static variable
}
