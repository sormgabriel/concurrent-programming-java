package main;

public class Buffer {
  private int dimension;
  private int index;
  private int numeros[];
	public Buffer(int dimension){
		this.dimension = dimension;
		this.numeros = new int[this.dimension];
		this.index = 0;
	}
	
	public synchronized void add(int element)
	{
		this.notify();
		this.numeros[index]= element;
		this.index++;
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public int dimension()
	{
		return this.dimension;
	}
	
	public synchronized int at(int index)
	{
		this.notify();
		if(this.numeros[index] == 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return this.numeros[index];
	}
}
