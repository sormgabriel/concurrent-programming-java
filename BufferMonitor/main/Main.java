package main;

public class Main {

	/**
	 * @param args
	 */
	private static Buffer buffer;
	public static void main(String[] args) {
		 buffer = new Buffer(10);
		 
		  
		 Thread tconsumidor = new Thread (){
			 public void run(){
				 final Consumidor consumidor = new Consumidor(buffer);
			 }
		 };
		 Thread tproductor = new Thread (){
			 public void run(){
				 final Productor productor = new Productor(buffer);
			 }
		 };
		 tconsumidor.start();
		 tproductor.start();
	}

}
