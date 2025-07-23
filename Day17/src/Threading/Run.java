package Threading;

public class Run extends Thread {

	public void run(){
		  
		int arr[]= {32,34,3,4,12,3,12,3,1234,123};
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int a : arr) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Array "+a);
		}
	}
	
	public static void main(String[] args) {
		Run t = new Run();
		t.start();
	}
	
}
