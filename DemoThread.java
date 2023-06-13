package threds;
//implements runnable interface
public class DemoThread implements Runnable{

	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("thread1 started");
	}	
	}
	public static void main(String args[]) {
		//creating instance of the class
		DemoThread dt=new DemoThread();
		//creating instance of thread class and starting the thread
		Thread t1=new Thread(dt);
		t1.start();
		
		DownloadThread d=new DownloadThread();
		Thread t2=new Thread(d);
		t2.start();
	}
}
