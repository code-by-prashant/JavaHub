package package3;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// LinkedList is good for add and delete operation application 
        // and bad for search application.
		LinkedList list = new LinkedList();
		
		
		list.add("prashant");
		list.add(123);
		list.add(1234.32);
		list.add(null);
		list.add(new Date());
		list.add(new Thread());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator i=list.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        
        System.out.println(list.contains(123));
        System.out.println(list.remove(null));
        System.out.println(list.isEmpty());
        System.out.println(list.size());

	}

}
