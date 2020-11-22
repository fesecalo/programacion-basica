package Main;

public class Main {

	static int[] myArray = {4,7,8,6,6,8,3,4};
	static int n=8;
	
	public static void main(String[] args) {
		
		boolean sim = true;
		//recorro el array desde el principio
		for(int e=0; e<myArray.length; e++)
		{
			//comparo los valores del final con el principio del array
			//si por lo menos uno no coincide, no es simetrico
			if(myArray[e]!=myArray[n-1])
			{
				sim=false;
			}
			
			//se cambia el indice desde el final.
			n--;
		}
		
		if(sim)
		{
			System.out.println("simetrico");
		}
		else
		{
			System.out.println("asimetrico");
		}
		
	}
}