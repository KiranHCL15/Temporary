package OOPsConcepts;
 class calculate
{
	static void add(double a,double b)
	{
		System.out.println("addition of "+a+" & "+b+" is "+(a+b));
	}
	static void add(int a,int b)
	{
		System.out.println("addition of "+a+" & "+b+" is "+(a+b));
	}
}
public class methodOverloading {
	
	public static void main(String[] args) {
		calculate.add(2, 3);
		calculate.add(1.5, 3.5);
       
	}

}
