package classes;

public class Local_Variable 
{

	public static void main(String[] args) 
	{
		
		abc obj=new abc();
		obj.disp();
		int roll=100;    //  local variable
		System.out.println("Roll= "+roll);

	}

}

class abc
{
	void disp()    // Method/Function
	{
		int mark=100;    //local variable
		System.out.println("Mark= "+mark);
	}
}