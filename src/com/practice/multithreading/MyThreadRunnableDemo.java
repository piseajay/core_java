package com.practice.multithreading;

class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello Ajay...I am thread : " + Thread.currentThread().getName() + " With priority : "
				+ Thread.currentThread().getPriority());
	}
}

public class MyThreadRunnableDemo {

	public static void main(String[] args) {

		MyRunnableThread t1 = new MyRunnableThread();

		Thread tr1 = new Thread(t1, "Equilizer");
		Thread tr2 = new Thread(t1, "Finalizer");

		tr1.setPriority(Thread.MAX_PRIORITY);
		tr1.start();
		tr2.setPriority(Thread.MIN_PRIORITY);
		tr2.start();

	}

}
