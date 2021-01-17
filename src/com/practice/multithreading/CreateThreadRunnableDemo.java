package com.practice.multithreading;

class MyRunnableThread implements Runnable {

	@Override
	public void run() {

		System.out.println("Hello Ajay...I am thread : " + Thread.currentThread().getName() + " With priority : "
				+ Thread.currentThread().getPriority());

	}

}

public class CreateThreadRunnableDemo {

	public static void main(String[] args) {

		System.out.println("I am " + Thread.currentThread().getName() + " Thread..My job has started...");

		MyRunnableThread t1 = new MyRunnableThread();
		Thread thread = new Thread(t1, "Runnable-1");
		Thread thread2 = new Thread(t1, "Runnable-2");

		thread.start();
		thread2.start();

		System.out.println("I am " + Thread.currentThread().getName() + " Thread..My job is finished...");

	}

}
