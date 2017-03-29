package basics;

public class Thread_Program3 implements Runnable{
	
	Thread myThread;
	Thread_Program3(){
		myThread = new Thread(this,"my thread");
		System.out.println(myThread.getName()+" new thread created");
		myThread.start();
	}
	
	public void run(){
		for (int i=0;i<5;i++){
			System.out.println("printing count" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("execution of thread completed");
	}

}
