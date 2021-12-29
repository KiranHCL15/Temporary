package OOPsConcepts;



class one
{
	public void methodA()
	{
		System.out.println("methodA implementations");
	}
}
 class two extends one
	{
		public void methodB()
		{
			System.out.println("methodB implementations");
//			super.methodA();
		}
	}

public class inheritance {


	public static void main(String[] args) {
    two t=new two();
    t.methodB();
		

	}

}
