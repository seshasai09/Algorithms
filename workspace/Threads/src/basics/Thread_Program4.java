package basics;

import java.util.ArrayList;
import java.util.List;

public class Thread_Program4 implements Runnable {
	
	public boolean running = false;
	
	public Thread_Program4(){
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.running = true;
		System.out.println("this is a seprate thread"+Thread.currentThread().getId());
		try{
			System.out.println("start");
			Thread.sleep(1000);
			System.out.println("end");
			
		}catch(Exception e){
			System.out.println("interrupted");
			Thread.currentThread().interrupt();
		}
		this.running=false;

	}
	
	public static void main(String[] args) throws InterruptedException{
		List<Thread_Program4> threads = new ArrayList<Thread_Program4>();
		System.out.println("this is main thread");
		for (int i=0;i<5;i++){ 
			threads.add(new Thread_Program4());
		}
		
		for (Thread_Program4 thread : threads){
			while(thread.running){
				System.out.println("asasdas");
			Thread.sleep(100); 
			}
		}
	}

}
