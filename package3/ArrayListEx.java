package package3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ArrayListEx {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// ArrayList is good for search application,
        // and bad for insert and delete applications.
		ArrayList list = new ArrayList();
		
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
