package main.contador;

import javax.swing.SingleSelectionModel;

public class ContadorThread extends Thread {

	private int variable;
	public  ContadorThread(){
		variable = 0;
		
	}
	
	
	public void run() {
		System.out.println("Comi3nxo tjra "+Thread.currentThread().getName());
		for(int i=0; i<10; i++){
		System.out.println("");
		
		}
	}

	public static void main(String[] args) {
		 final Contador contador = new Contador();
		ContadorThread t1 = new ContadorThread(){public void run() {
			System.out.println("Comi3nxo tjra "+Thread.currentThread().getName());
			for(int i=0; i<10; i++){System.out.println(contador.incrementar()+Thread.currentThread().getName());};
			}};
		ContadorThread t2 = new ContadorThread(){public void run() {
			System.out.println("Comi3nxo tjra "+Thread.currentThread().getName());
			for(int i=0; i<10; i++){System.out.println(contador.decrementar()+Thread.currentThread().getName());}
			}};
		
			t1.start();
			t2.start();
		

	}

}
