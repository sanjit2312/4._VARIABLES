package classes;

public class Static_Variable 
{

	public static void main(String[] args)
	{

       Sanjit.mark=100;
       System.out.println("Roll ="+Sanjit.roll);
       System.out.println("Mark ="+Sanjit.mark);	
       
	}

}

class Sanjit
{
	static int roll=10;      //  static variable
	static int mark;         //  static variable
}
