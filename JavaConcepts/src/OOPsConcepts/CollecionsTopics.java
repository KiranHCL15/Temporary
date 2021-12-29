package OOPsConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollecionsTopics {

	public static void main(String[] args) {
		                          ////collections
		         //List             //Queue          //Set
		//Arraylist
		//maintains insertion order & non-synchronized
		System.out.println("**************Arraylist****************");
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("kiran");//Adding object in arraylist  
		list.add("hcl");  
		list.add("pune");  
		list.add("magarpatta");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(" "+list.get(i));
		}
		

		//linked list
		//maintains insertion order & non-synchronized
		System.out.println("**************LinkedList****************");
		LinkedList<String> al=new LinkedList<String>();  
		al.add("kiran");  
		al.add("indian");  
		al.add("karnataka");  
		al.add("mudhol");  
		Iterator<String> iter=al.iterator();  
		while(iter.hasNext())
		{  
			System.out.println(iter.next());  
		}  

		//HashSet
		//used to store the elements in the HashSet
		//contains unique elements
		System.out.println("**************HashSet****************");
		HashSet<String> set=new HashSet<String>();  
		set.add("kiran");  
		set.add("hcl");  
		set.add("kiran");  
		set.add("pune");  
		//Traversing elements  
		Iterator<String> itr3=set.iterator();  
		while(itr3.hasNext())
		{  
			System.out.println(itr3.next());  
		} 

                   //Set Interface
		//LinkedHashSet
		//contains unique elements
		//allow null
		System.out.println("**************LinkedHashSet******************");
		LinkedHashSet<String> Lset=new LinkedHashSet<String>();  
		Lset.add("Ravi");  
		Lset.add("Vijay");  
		Lset.add("Ravi");  
		Lset.add("Ajay");  
		Lset.add(null); 
		Iterator<String> itr4=Lset.iterator();  
		while(itr4.hasNext())
		{  
			System.out.println(itr4.next());  
		} 


		//treeSet
		//the access and retrieval time of TreeSet is quite fast
		//elements in TreeSet stored in ascending order.
		System.out.println("*******************TreeSet**********************");
		TreeSet<String> Tset=new TreeSet<String>();  
		Tset.add("kiran");  
		Tset.add("hcl");  
		Tset.add("testEngineer");
		Tset.add("Automation");  
		//traversing elements  
		Iterator<String> itr5=Tset.iterator();  
		while(itr5.hasNext())
		{  
			System.out.println(itr5.next());  
		}
		
		/////////////////////////////MAP Interface//////////////////////////////
		//hashmap
		//it stores the data in key & value pairs
		//doesnt maintains insertion order
		System.out.println("**************HashMap*****************");
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "kiran");
		map.put(2, "rajiv");
		map.put(3, "mohan");
		map.put(4, "yash");
		map.put(5, "sudeep");
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.get(5));
	    Set<Entry<Integer, String>> allEntries = map.entrySet();
		for(Entry<Integer, String> e:allEntries)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		//LinkedHashMap
		//maintains insertion order
		System.out.println("***********************LinkedHashMap*************************");
		LinkedHashMap<Integer, String> Lmap=new LinkedHashMap<>();
		Lmap.put(1, "kiran");
		Lmap.put(2, "rajiv");
		Lmap.put(3, "mohan");
		Lmap.put(4, "yash");
		Lmap.put(5, "sudeep");
		
		System.out.println(Lmap);
		System.out.println(Lmap.keySet());
		System.out.println(Lmap.get(5));
	    Set<Entry<Integer, String>> L_allEntries = Lmap.entrySet();
		for(Entry<Integer, String> e:L_allEntries)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		
		//TreeMap
		//mainatains ascending order
		System.out.println("**********************TreeMap************************");
		TreeMap<Integer, String> Tmap=new TreeMap<>();
		
		Tmap.put(1, "kiran");
		Tmap.put(2, "rajiv");
		Tmap.put(3, "mohan");
		Tmap.put(4, "yash");
		Tmap.put(5, "sudeep");
		
		System.out.println(Tmap);
		System.out.println(Tmap.keySet());
		System.out.println(Tmap.get(5));
	    Set<Entry<Integer, String>> T_allEntries = Tmap.entrySet();
		for(Entry<Integer, String> e:T_allEntries)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		

	}

}
