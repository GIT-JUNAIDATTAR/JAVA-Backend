package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Stack;

public class CollectionFrameWork {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("juanid-0");//add() - is for add values in array
		arr.add("omkar-1");
		arr.add("diviesh-2");
		arr.add("prathamesh-6");
		arr.add("sohan-7");
		arr.add("nikhil-8");
		
		System.out.println(arr);
		
		arr.remove(4); // remove()- is use for removing the value from array
		System.out.println(arr);
		
		arr.set(4,"chetan-9");// set()- is use for replace the element
		System.out.println(arr);
		
		
		Stack<String> s = new Stack<>();
		s.push("zero");//push() - is use for push the first come value in stack
		s.push("one");
		s.push("two");
		s.push("three");
		s.push("four");
		s.push("five");
		
		System.out.println(s);
		
		s.pop();//pop()- remove last value
		System.out.println(s);
		
		System.out.println(s.peek()); //peek()- retrieves the element at the top of the stack without removing it.
		
	}
	
}
