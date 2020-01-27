package edu.eci.arsw.primefinder;

import java.util.ArrayList;

public class KillThread extends Thread{
	ArrayList<PrimeFinderThread> PrimeThreads;
	public KillThread() {
		PrimeThreads= new ArrayList<PrimeFinderThread>( ); 
	}
	public void run() {
		try {
			PrimeFinderThread hilo1 = new PrimeFinderThread(0, 10000000);
			PrimeThreads.add(hilo1);
			PrimeFinderThread hilo2 = new PrimeFinderThread(10000000, 20000000);
			PrimeThreads.add(hilo2);
			PrimeFinderThread hilo3 = new PrimeFinderThread(20000000, 30000000);
			PrimeThreads.add(hilo3);
			for (PrimeFinderThread h: PrimeThreads) {
				h.start();
			}
			Thread.sleep(5000);
			int totalPrimos = 0;
			for (PrimeFinderThread h: PrimeThreads) {
				h.suspend();
				totalPrimos += h.getPrimes().size();
			}
			System.out.println(totalPrimos);
			
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}

}
