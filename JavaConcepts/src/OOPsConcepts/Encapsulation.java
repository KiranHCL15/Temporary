package OOPsConcepts;

public class Encapsulation {

	private int amount=2000;
	public int getAmount()
	{
		return amount;
	}
	
	public void setAmount(int amount)
	{
		this.amount=amount;
	}
	public static void main(String[] args) {
		Encapsulation ecap=new Encapsulation();
		System.out.println(ecap.getAmount());
		
		ecap.setAmount(3000);
		System.out.println(ecap.getAmount());
      
	}

}
