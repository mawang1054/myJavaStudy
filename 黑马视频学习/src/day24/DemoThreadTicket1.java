package day24;

public class DemoThreadTicket1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new TicketSell());
		Thread t2 = new Thread(new TicketSell());
		Thread t3 = new Thread(new TicketSell());
		Thread t4 = new Thread(new TicketSell());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class TicketSell implements Runnable {
	private static int tickleNum = 1000;
	
	
	
	@Override
	public void run() {
		while(true) {
			synchronized(TicketSell.class) {
				if (tickleNum == 0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "---" + tickleNum--);
			}
		}
	}
	
}