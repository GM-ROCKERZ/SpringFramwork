
public class ThreadPriortyDemo extends Thread {
	
	public void run() {
		System.out.println("Running.....");
	}
	
	public static void main(String args[]) {
		
		ThreadPriortyDemo thread1= new ThreadPriortyDemo();
		ThreadPriortyDemo thread2= new ThreadPriortyDemo();
		
		System.out.println("Default Thread Priorty of thread1:"+thread1.getPriority());
		System.out.println("Default Thread Priorty of thread2:"+thread2.getPriority());
		
		thread1.setPriority(MAX_PRIORITY);
		thread2.setPriority(MIN_PRIORITY);
		
		System.out.println("\n Maximum Thread Priorty of Thread1 is:"+thread1.getPriority());
		System.out.println("\n Mininmum Thread Priorty of Thread1 is:"+thread2.getPriority());
		
		System.out.println("\n"+Thread.currentThread().getName());
		System.out.println("\n Default thread priority of Main Thread: " + Thread.currentThread().getPriority());
	      Thread.currentThread().setPriority(MAX_PRIORITY);
	    System.out.println("The maximum thread priority of Main Thread is: " + Thread.currentThread().getPriority());
	}

}
