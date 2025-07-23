package Threading;

import java.util.Scanner;

public class Threading extends Thread{

	

	public void m1() {
		
		Thread thread = new Thread();
		try {
			thread.sleep(2000);
			thread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		int num = 2;
		
		for(int i = 1;i<=10;i++) {
			
			int result = num * i;
			
			System.out.println(num + "*" + i + "=" + result);
			
		}
	}
	
	public void m2() {
		try {
			Thread.sleep(3000);
	int num = 4;
		
		for(int i = 1;i<=10;i++) {
			int result = num * i;
			
			System.out.println(num + "*" + i + "=" + result);
			
		}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void m3(int a) {
	
		try {
			
			if(a>0) {
				if(a % 2 ==0) {
					System.out.println(a + "is even number");
				}
				
				else {
					System.out.println(a + " is odd number");
				}
			}
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Threading t = new Threading();
		t.m1();
		t.m2();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int a = sc.nextInt();
		t.m3(a);
	}
}
