package Abstraction;

public class AbstractClass extends Animals {

	public static void main(String[] args) {
		
		Cow c = new Cow();
		c.eat();
		
		Tiger t = new Tiger();
		t.eat();

		
		Bear b = new Bear();
		b.eat();
		
		Goat g = new Goat();
		g.eat();
		
		Monkey m = new Monkey();
		m.eat();
		m.sound();
		
		Lion l = new Lion();
		l.eat();
		l.sound();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}


}

abstract class Animals{
	abstract public void eat();
}

class Cow extends Animals{
	public void eat(){
		System.out.println("veg");
		}
	

}

class Tiger extends Animals{
	public void eat() {
		System.out.println("non-veg");
	}
}

class Bear extends Animals{
	public void eat() {
		System.out.println("veg / non-veg");
	}
}

class Goat extends Animals{
	public void eat() {
		System.out.println("veg");
	}
}

class Monkey extends Animals{
	public void eat() {
		System.out.println("veg / non-veg");
	}
	
	public void sound() {
		System.out.println("laugh");
	}
}

class Lion extends Animals{
	public void eat() {
		System.out.println("non-veg");
	}
	
	public void sound() {
		System.out.println("roar");
	}
}
