package edu.eci.arsw.primefinder;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		//PrimeFinderThread pft=new PrimeFinderThread(0, 30000000);
		 
		KillThread TH = new KillThread();
		TH.start();

		//pft.start();
		
	}
	
}
