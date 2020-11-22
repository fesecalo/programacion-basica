package main;

import java.util.Arrays;

public class Main {

	static int[] array = {1,2,3,4,5,6,7,8,8,8,8};
	
	public static void main(String[] args) {
		
		//se divide en dos, por que por cada vuelta, se "corrigen" dos valores (el principio y el final) a la misma vez
		for(int i=0; i<array.length/2; i++)
		{
			//se guardan los valores a ser cambiados
		    int indexIni = array[i];
		    int indexFin = array[array.length-i-1];
		    
		    //se intercambian los valores en el array
		    array[i]=indexFin;
		    array[array.length-i-1] = indexIni;
		}

		//se muestra despues de ordenado
		for(int y=0; y<array.length; y++)
		{
			System.out.println(array[y]);
		}
		

	}

}
