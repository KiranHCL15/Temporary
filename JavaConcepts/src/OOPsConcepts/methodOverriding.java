package OOPsConcepts;

class first
{
	public void method()
	{
		System.out.println("first method implementation");
	}
}
class second extends first
{
	public void method()
	{
		System.out.println("second method implementation");
//		super.method();
	}
}
public class methodOverriding {

	public static void main(String[] args) {
		second sec=new second();
		sec.method();

	}

}
