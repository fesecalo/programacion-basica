package main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arrayTest = {8,4,-5,88,-50,1088};
		deMayorAMenor(arrayTest);
		
	}
	
	public static int[] deMayorAMenor(int[] array)
	{
		for(int e=0; e<array.length; e++)
		{
			for(int i=0; i<array.length; i++)
			{
				//si el valor acutal es mayor y está dentro de otra posicion en el array(no se compare con el mismo). Los intercambio
				if(array[e]>array[i] && e!=i)
				{
					//guardo los valores antes de reemplazarlo
					int temp = array[e];
					int temp2 = array[i];
					
					//se intercambian
					array[e]=temp2;
					array[i]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		
		return array;
	}

}
