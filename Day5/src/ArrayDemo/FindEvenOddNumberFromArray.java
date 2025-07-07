package ArrayDemo;

public class FindEvenOddNumberFromArray {

	public static void main(String[] args) {
		
		int arr1[] = {2,4,8,7,9,31,32,53,66};
		
		for(int i=0; i<=arr1.length-1; i++) {
			
			if(arr1[i] % 2 == 0) {
				System.out.println("even number- " + arr1[i]);
			}
			
			else {
				System.out.println("odd number-" + arr1[i]);
			}
		}
	}
}
