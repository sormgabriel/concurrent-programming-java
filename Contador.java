package main.contador;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Contador {
	private int variable;
	public Contador(){
		variable = 0;
	}
	
	public synchronized int variable(){
		return this.variable;
	}
	
	public synchronized int incrementar(){
		
		this.notifyAll();
		return this.variable++;
		
	}
	
	public synchronized int decrementar(){
		try {
			this.wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		return this.variable--;}
				
	}

			
		
	
	



