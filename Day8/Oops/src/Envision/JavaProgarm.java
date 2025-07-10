package Envision;
                       // we don't need to import default class here , it was easily accessible and not secure
public class JavaProgarm {

	public static void main(String[] args) {
	
//		Greeting abc = new Greeting();
//		abc.hello();
		
		Greeting abc = new Greeting();// we can access the data without importing package and class name
		abc.hello(); 
		
	}

}

class Greeting { 
	public void hello() {
		System.out.print("hello");// function
	}
}

