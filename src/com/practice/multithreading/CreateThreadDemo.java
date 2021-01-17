package com.practice.multithreading;

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello Ajay...I am thread : " + Thread.currentThread().getName() + " With priority : "
				+ Thread.currentThread().getPriority());
	}
}

public class CreateThreadDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.setName("Finalizer");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.setName("Equilizer");
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();

	}

}
