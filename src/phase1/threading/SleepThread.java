package phase1.threading;

public class SleepThread extends Thread {
	
	public void run() {
		for(int i = 1; i<5; i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +"  : "+ i);
		}
	}
	public static void main(String[] args)
	{
		SleepThread t1 = new SleepThread();
		t1.setName("Program1");
		t1.setPriority(MAX_PRIORITY);
		SleepThread t2 = new SleepThread();
		t2.setName("Program2");
		t2.setPriority(NORM_PRIORITY);
		SleepThread t3 = new SleepThread();
		t3.setName("Program3");
		SleepThread t4 = new SleepThread();
		t4.setName("Program4");
		SleepThread t5 = new SleepThread();
		t5.setName("Program5");
		t5.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		System.out.println(t4.getState());
		System.out.println(t5.getState());
	}

}
