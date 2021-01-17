package com.practice.multithreading;

class MyRunnableClass extends Thread {

	@Override
	public void run() {
		System.out.println("Hello Ajay...I am thread : " + Thread.currentThread().getName() + " With priority : "
				+ Thread.currentThread().getPriority());
	}
}

public class MyThreadClassDemo {

	public static void main(String[] args) {

		MyRunnableClass t1 = new MyRunnableClass();
		MyRunnableClass t2 = new MyRunnableClass();

		t1.setName("Finalizer");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.setName("Equilizer");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();

	}

}
