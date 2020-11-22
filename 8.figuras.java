package main;

import java.util.Scanner;

public class Main {
		
		public static void main(String[] args) {
			//se despliega menú para que usuario seleccione patrón
			menu();
		}
		
		//MÉTODOS
		static void menu()
		{
			patronCuadrado();
			patronZeta();
			patronEquis();
			patronZeta2();
		}
		
		
		static void patronCuadrado ()
		{
			int i,j;
			int n = 8;
			
			//se recorren las filas
			for(i=1; i<=n;i++)
			{
				//se recorren las columas de la fila i
				for(j=1;j<=n;j++)
				{
					//en el caso que sea la primera o la última fila, se imprimien todos los *
					if(i==1 || i==n)
					{
						System.out.printf("*");
					}
					else if(j==1 || j==n) //consulto si es la primera columna o la última, si es el caso imprimir *
					{
						System.out.printf("*");
					}
					else
					{
						System.out.printf(" ");
					}
				}
				System.out.printf("\n");
			}
		}
		
		static void patronZeta ()
		{
			int i,j;
			int n = 8;
			
			//se recorren las filas
			for(i=1; i<=n;i++)
			{
				//se recorren las columas de la fila i
				for(j=1;j<=n;j++)
				{
					//en el caso que sea la primera o la última fila, se imprimien todos los *
					if(i==1 || i==n)
					{
						System.out.printf("*");
					}
					else if(n-i+1 == j)
					{
						System.out.printf("*");
					}
					else
					{
						System.out.printf(" ");
					}
				}
				System.out.printf("\n");
			}
		}
		
		static void patronEquis ()
		{	
			int i,j;
			int n = 8;
			
			//se recorren las filas
			for(i=1; i<=n;i++)
			{
				//se recorren las columas de la fila i
				for(j=1;j<=n;j++)
				{ 
					if(n-i+1 == j || j==i)
					{
						System.out.printf("*");
					}
					else
					{
						System.out.printf(" ");
					}
				}
				System.out.printf("\n");
			}
		}
		
		static void patronZeta2 ()
		{
			int i,j;
			int n = 8;
			
			//se recorren las filas
			for(i=1; i<=n;i++)
			{
				//se recorren las columas de la fila i
				for(j=1;j<=n;j++)
				{
					
					if(j==1 || j==n)
					{
						if(i==j)
						{
							System.out.printf("*");
						}
						else
						{
							System.out.printf(" ");
						}
					}
					else
					{
						System.out.printf("*");
					}
				}
				System.out.printf("\n");
			}
		}

}
