package edu.eci.arsw.primefinder;

import java.util.ArrayList;
import java.util.Scanner;

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
			System.out.println("Cantidad de primos encontrados: " + totalPrimos);
			
			Scanner s=new Scanner(System.in);
			System.out.println("Presiona enter para seguir con el proceso");
			s.nextLine();
			for (PrimeFinderThread h: PrimeThreads) {
				h.resume();
				
			}
			
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}

}
