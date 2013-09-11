package samples.sample035;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Main035 {

	public static void main(String[] args) {
		HashMap<String,String> hash = new HashMap<String,String>();
		hash.put("huga", "hoge");
		System.out.println(hash.get("huga"));
		
		ArrayList<Integer> array= new ArrayList<Integer>();
		array.add(5);
		array.add(4);
		array.add(3);
		array.add(2);
		Iterator<Integer> itr = array.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		Collections.max(array);
		itr = array.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
