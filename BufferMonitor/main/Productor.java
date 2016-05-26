package main;

public class Productor {

	public Productor(Buffer buffer){
		
		this.agregarNumerosNaturalesConsecutivos(buffer);
	}
	
	public void agregarNumerosNaturalesConsecutivos(Buffer buffer)
	{
		for(int index = 1; index <= buffer.dimension(); index++ )
		    buffer.add(index);
		
	}
}
