/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {
	int a;
	int b;
	public CountThread(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void run() {
		int i;
		i=0;
		for(i=a;i<=b;i++) {
			System.out.println(i);
		}
		
	}
	 public static void main(String[] args) {
		 CountThread obj = new CountThread(100, 200);
	     obj.start();
	 }
    
}
