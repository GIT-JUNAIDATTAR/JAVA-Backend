package Envision;
import Envision.SecondClass;
import Envision.ThirdClass;
import Envision.FourthClass;
import Envision.FifthClass;
import Envision.SixthClass;
import Envision.SeventhClass;

public class FirstClass {

	public static void main(String[] args) {
		
		SecondClass add = new SecondClass();
		add.add(2, 2);
		
		ThirdClass sub = new ThirdClass();
		sub.sub(10, 5);
		
		FourthClass divide = new FourthClass();
		divide.divide(2, 4);
		
		FifthClass box = new FifthClass();
		box.BoxStarPattern();
		
		SixthClass arr = new SixthClass();
		arr.MyString();
		
		SeventhClass pyramid = new SeventhClass();
		pyramid.pyramid();
		
		EightClass mul = new EightClass();
		mul.multiply(4,4);
	}
}
