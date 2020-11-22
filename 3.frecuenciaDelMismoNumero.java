package main;

public class Main {
	
	static int[] myArray = {1,2,1,3,3,1,2,1,5,1};

	public static void main(String[] args) {
		
		//para imprimir los números del 1 al 5. Son fijos según los requerimientos 
		for(int n=1; n<=5;n++)
		{
			System.out.print(n+": ");
			for(int e=0; e<myArray.length;e++)
			{
				if(myArray[e]==n)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}	
	}
}