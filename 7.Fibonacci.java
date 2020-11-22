package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//se obtiene el l�mite del fibonacci
		int limit=8;
		
		//se declaran las tres variables necesarias para la l�gica
		int old = 0;
		int nw = 0;
		int print = 0;
		
		//el cero SIEMPRE ser� impreso.
		System.out.println(0);
		
		for(int i=0;i<limit;i++)
		{
			if(i==0)
			{
				//cuando va en la primera iteraci�n, se imprime el 1
				System.out.println(1);
				
				old=0; //n�mero anterior en la secuencia
				nw=1; //nuevo n�mero de la secuencia
			}
			else
			{
				print=old+nw; //se imprime el antiguo valor sumado al nuevo valor de la secuencia
				System.out.println(print);
				old=nw; //como ya se imprime el n�mero, el valor nuevo pasa a ser el antiguo
				nw=print; //el valor impreso es el nuevo n�mero de la secuencia
			}
		}
	}
}
