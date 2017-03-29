package basics;

public class Driver_Thread_Prog3 {
	
	public static void main(String[] args){
		Thread_Program3 t = new Thread_Program3();
		try{
			while(t.myThread.isAlive()){
				System.out.println("child thread still running");
				Thread.sleep(1500);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("thread execution complete");
	}

}
