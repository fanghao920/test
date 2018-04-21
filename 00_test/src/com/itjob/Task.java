package com.itjob;

public class Task implements Runnable{
	volatile boolean running = true;
	int i = 0;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Task task = new Task();
		Thread t = new Thread(task);
		t.start();
		Thread.sleep(10);
		task.running = false;
		Thread.sleep(100);
		System.out.println(task.i);
		System.out.println("程序结束");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(running){
			i++;
		}
	}

}
