package day25;

public class DemoThreadNotify1 {
	public static void main(String[] args) {
		MyPrinter mp = MyPrinter.getObject();
		new Thread() {

			@Override
			public void run() {
				try {
					mp.print1();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			
		}.start();
		
		new Thread() {

			@Override
			public void run() {
				try {
					mp.print2();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			
		}.start();
		
		new Thread() {

			@Override
			public void run() {
				try {
					mp.print3();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			
		}.start();
	}
}

class MyPrinter {
	private MyPrinter() {}
	
	private static MyPrinter mp = new MyPrinter();
	private static int flag = 0;
	
	public static MyPrinter getObject() {
		return mp;
	}
	
	public void print1() throws InterruptedException {
		while(true) {
			synchronized(this) {
				if(flag == 0) {
					System.out.print("m");
					System.out.print("a");
					System.out.print("w");
					System.out.print("a");
					System.out.print("n");
					System.out.print("g");
					System.out.println();
					flag = 1;				
				}
				else
					this.wait();
					this.notifyAll();
			}
		}
	}
	
	public void print2() throws InterruptedException {
		while(true)
			synchronized(this) {
				if(flag == 1) {
					System.out.print("a");
					System.out.print("b");
					System.out.print("c");
					System.out.print("d");
					System.out.print("e");
					System.out.print("f");
					System.out.println();
					flag = 2;	
				}
				else
					this.wait();
					this.notify();
			}
	}

	public void print3() throws InterruptedException {
		while(true)
			synchronized(this) {
				if(flag == 2) {
					System.out.print("c");
					System.out.print("c");
					System.out.println();
					flag = 0;

				}
				else
					this.wait();					
					this.notify();
			}
	}
}
