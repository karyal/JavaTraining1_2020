package collections.collections;

import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.LinkedList;

public class StackTest {
	public static void main(String[] args) {
		//Stack
		List stack = new Stack(); 
		stack.add(58);
		stack.add(78);
		stack.add(77);		
		System.out.println(stack.size());
		
		for(Object item: stack) {
			System.out.println(item);
		}
		
		//Vector
		List vector = new Vector();
		vector.add("Kathmandu");
		vector.add("List");
		vector.add("Vector");
		vector.add("Stack");
		vector.add("Rajan");
		System.out.println(vector.size());
		
		for(Object item: vector) {
			System.out.println(item);
		}
		
		//LinkLits
		List link_list = new LinkedList<String>();
		link_list.add("Balaju");
		link_list.add("Kalanki");
		link_list.add("Bhojpur");
		link_list.add("Birjung");
		System.out.println(link_list.size());
		
	}
}
