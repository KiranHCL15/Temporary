package OOPsConcepts;

public class StringsConcepts {

	public static void main(String[] args) {
//		String a="kiran";
//		String s1=new String("kiran");
//		System.out.println(a+" "+s1);
//		if(a==s1){
//			System.out.println("equals");
//		}else
//		{
//			System.out.println("not equal");
//		}
//		if(a.equals(s1))
//		{
//			System.out.println(true);
//		}else
//		{
//			System.out.println(false);
//		}
		
		
		
//		 String s1 = "HELLO";
//	        String s2 = "HELLO";
//	        String s3 =  new String("HELLO");
//	  
//	        System.out.println(s1 == s2); // true
//	        System.out.println(s1 == s3); // false
//	        System.out.println(s1.equals(s2)); // true
//	        System.out.println(s1.equals(s3)); // true
		
//		System.out.println(10 == 20);
//		  
//        // char-type
//        System.out.println('a' == 'b');
//  
//        // char and double type
//        System.out.println('a' == 97.0);
//  
//        // boolean type
//        System.out.println(true == true);
		
		
		Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
  
        String s1 = new String("GEEKS");
        String s2 = new String("GEEKS");
  
        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(s1 == s2);
  
        System.out.println(t1.equals(t2));
        System.out.println(s1.equals(s2));

	}

}