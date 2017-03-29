package basics;

public class Thread_Program2 implements Runnable{
	
	public void run(){
		System.out.println("thread in running state"+this);
	}
	
	public static void main(String args[]){
		Thread_Program2 obj = new Thread_Program2();
		Thread t = new Thread(obj);
		t.setName("thread1");
		t.setPriority(10);
		t.start();
		System.out.println(t.getName());
	}

}
