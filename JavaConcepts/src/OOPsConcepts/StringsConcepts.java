package OOPsConcepts;

public class StringsConcepts {

	public static void main(String[] args) {
		String a="kiran";
		String s1=new String("kiran");
		System.out.println(a+" "+s1);
		if(a==s1){
			System.out.println("equals");
		}else
		{
			System.out.println("not equal");
		}
		if(a.equals(s1))
		{
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}

		System.out.println("char at the index 3 is "+s1.charAt(3));
//
		if(s1.contains("an"))
		{
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}
		////////////////////
		String concatString=s1.concat("ghorpade");
		System.out.println(concatString);
		
		System.out.println("length of string "+concatString+" is "+concatString.length());
		System.out.println("converting "+concatString+" to uppercase "+concatString.toUpperCase());
		System.out.println("converting "+concatString+" to lowercase "+concatString.toLowerCase());
		
		System.out.println(a.equalsIgnoreCase(s1));
		


		String s3 = "HELLO";
		String s4 = "HELLO";
		String s5 =  new String("HELLO");

		System.out.println(s3 == s4); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.equals(s5)); // true
		System.out.println("hi kiran i m here");



	}

}
