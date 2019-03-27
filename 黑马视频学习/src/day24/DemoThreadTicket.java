package day24;

public class DemoThreadTicket {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("Thread1");
		Ticket t2 = new Ticket("Thread2");
		Ticket t3 = new Ticket("Thread3");
		Ticket t4 = new Ticket("Thread4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

//	public static void main(String[] args) {
//		TicketsSeller t1 = new TicketsSeller();
//		TicketsSeller t2 = new TicketsSeller();
//		TicketsSeller t3 = new TicketsSeller();
//		TicketsSeller t4 = new TicketsSeller();
//		
//		t1.setName("窗口1");
//		t2.setName("窗口2");
//		t3.setName("窗口3");
//		t4.setName("窗口4");
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//	}
}

class Ticket extends Thread {
	private static int ticketNum = 1000;
	
	public Ticket() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Ticket(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

	public void run() {
		
			while(true) {synchronized(Ticket.class) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				if (ticketNum == 0) {
					break;
				}
				System.out.println(getName() + "---" + ticketNum--);
			}
		}

	}
}

class TicketsSeller extends Thread {
	private static int tickets = 1000;
	static Object obj = new Object();
	public TicketsSeller() {
		super();
		
	}
	public TicketsSeller(String name) {
		super(name);
	}
	public void run() {
		while(true) {
			synchronized(obj) {
				if(tickets <= 0) 
					break;
				try {
					Thread.sleep(10);//线程1睡,线程2睡,线程3睡,线程4睡
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(getName() + "...这是第" + tickets-- + "号票");
			}
		}
	}
}