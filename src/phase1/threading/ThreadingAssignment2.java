package phase1.threading;
class Customer{
	int amount = 10000;
	synchronized void withdraw (int amount)
	{
		if(this.amount < amount)
		{
			System.out.println("Less balance : Waiting for deposit");
			try {
				wait();
			}
			catch(Exception e) {
				
			}
			this.amount -= amount;
			System.out.println("withdrawal complete... ");
		}
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit");
		this.amount += amount;
		System.out.println("Deposit completed and new balance is :"+ this.amount);
	}
}

public class ThreadingAssignment2 {
 public static void main (String[] args)
 {
	 final Customer c = new Customer();
	 new Thread() {
		 public void run() {
			 c.deposit(10000);
		 }
	 }.start();
	 new Thread() {
		 public void run() {
			 c.withdraw(4000);
		 }
	 }.start();
	 new Thread() {
		 public void run() {
			 c.withdraw(5000);
		 }
	 }.start();
	 new Thread() {
		 public void run() {
			 c.withdraw(10000);
		 }
	 }.start();
 }
 
}

