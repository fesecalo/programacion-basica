package main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//int[] arrayTest = {8,7,6};
		//int[] arrayTest = {1,2,3,4,11,12,15,16,17,2001};
		//int[] arrayTest = {8,8,8,8,8};
		int[] arrayTest = {1,2,3,8,9,8,7,6};
		verificaOrden(arrayTest);
	}

	public static void verificaOrden(int[] array)
	{
		boolean igual = true;
		boolean cre = true;
		boolean des = true;
		
		//verifico si los números son todos iguales.
		for(int i=0; i<array.length-1;i++)
		{
			int primero = array[0];
			if(array[i+1]!=primero) //para que no se compare con el mismo.
			{
				igual=false;
			}
			
			if(array[i]>array[i+1])
			{
				cre=false;
			}
			
			if(array[i]<array[i+1])
			{
				des=false;
			}
		}
		
		if(igual)
		{
			System.out.println("iguales");
		}
		else
		{
			if(cre==false && des==false)
			{
				System.out.println("desorden");
			}
			else if(cre)
			{
				System.out.println("creciente");
			}
			else if(des)
			{
				System.out.println("des");
			}
		}
	}
}
