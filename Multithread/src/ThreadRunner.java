class Task1 extends Thread{
	public void run() {
		System.out.print("\nTask 1 Started ");
		
		for(int i=101;i<=199;i++) 
			System.out.print(i+ " ");
		
		System.out.print("\nTask 1 Done ");
	}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.print("\nTask 2 Started ");
		for(int i=201;i<=299;i++) 
			System.out.print(i+ " ");
		
		System.out.print("\nTask 2 Done ");
		
	}
	
}
public class ThreadRunner {
	public static void main(String[] args) {
		//Task 1 - 101 to 199
		System.out.print("\nTask 1 Kicked off ");
		Task1 task1 = new Task1();
		task1.start();
		
		//Task 2 - 201 to 299
		System.out.print("\nTask 2 Kicked off ");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		
		
		//Task 3 - 301 to 399
		System.out.print("\nTask 3 Kicked off ");
		for(int i=301;i<=399;i++) 
			System.out.print(i + " ");
		System.out.print("\nTask 3 Done ");
		
		System.out.print("\nMain Done ");
	}
}
