package pattern_program;

public class p2 
{
void printer(int a)
	{	
	System.out.println(a);
	}
void printer(float a, float b)
	{
		System.out.println(a -b);
	}

	public static void main(String[] args) 
	{
		p2 p = new p2();
		p.printer(24);
		p.printer(20,10);
		String s="DURGAPRASAD";
		System.out.println(s.substring(1));
		System.out.println(s.substring(1,9));
	}

}
