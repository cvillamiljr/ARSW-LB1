package edu.eci.arsw.math;

import edu.eci.arsw.threads.CountThread;

public class MyThread extends Thread {
	int start;
	int count;
	byte[] r;
	
	public MyThread(int start, int count) {
		this.start=start;
		this.count=count;
	}
	
	public void run() {
		this.r=PiDigits.getDigits(start,count);
	}
	
	public byte[] getResultado() {
		return this.r;
	}
	
	public static void main(String[] args) {
		MyThread obj = new MyThread(0,5); 
		obj.start();
	}
}
