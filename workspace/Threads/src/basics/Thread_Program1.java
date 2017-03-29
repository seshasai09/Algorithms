package basics;

public class Thread_Program1 extends Thread{
	public void run(){
		System.out.println("Thread is in running state");
	}
	
	public static void main(String[] args){
		Thread_Program1 t1 = new Thread_Program1();
		t1.setName("First Thread");
		t1.start();
	}

}


