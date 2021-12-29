package OOPsConcepts;

abstract class Bank{    
	abstract int getRateOfInterest();    
}    
class SBI extends Bank{    
	int getRateOfInterest()
	{
		return 7;
	}    
}    
class PNB extends Bank{    
	int getRateOfInterest()
	{
		return 8;
	}    
}
public class abstraction {

	public static void main(String[] args) {
		Bank s=new SBI();
		System.out.println("SBI's rate of interest is: "+s.getRateOfInterest());

		Bank p=new PNB();
		System.out.println("PNB's rate of interest is: "+p.getRateOfInterest());


	}

}
