package main;

public class Consumidor {

	public Consumidor(Buffer buffer){
	  this.consumir(buffer);
	}
	
	public void consumir(Buffer buffer)
	{
		for(int index=0; index < buffer.dimension(); index++)
		{
			System.out.println(buffer.at(index));	
		}
	}

}
