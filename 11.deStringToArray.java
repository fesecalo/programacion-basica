package deStringToArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class deStringToArray {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
		ArrayList<String> ary = new ArrayList<String>(Arrays.asList(cadena.split("")));
		
		System.out.println("¿ Cuales son los caracteres que la componen ?");
		for(int e=0; e<ary.size();e++)
		{
			System.out.print(ary.get(e)+" ");
		}
		System.out.println();
		System.out.println("¿ Cuantas veces están dentro de la cadena ?");
		cuentaFrecuencia(eliminaDuplicados(ary), ary);
	}
	
	//elimina los duplicados de un array
	public static ArrayList<String> eliminaDuplicados(ArrayList<String> cadenaComoArray)
	{
		ArrayList<String> sinDuplicados = new ArrayList<String>();
        for(int e=0; e<cadenaComoArray.size();e++)
        {
            for(int i=0; i<cadenaComoArray.size();i++)
            {
		        if (cadenaComoArray.get(e).equals(cadenaComoArray.get(i)))
		        {
		        	if(!sinDuplicados.contains(cadenaComoArray.get(e)))
		        	{
		        		sinDuplicados.add(cadenaComoArray.get(e));
		        	}
		        }
            }
        }
		return sinDuplicados;
	}
	
	//cuenta la frecuencia de cada indice del array entregado.
	public static void cuentaFrecuencia(ArrayList<String> sinDuplicados, ArrayList<String> cadenaComoArray)
	{
        for(int e=0; e<sinDuplicados.size();e++)
        {
        	int x=0;
            for(int i=0; i<cadenaComoArray.size();i++)
            {
		        if (sinDuplicados.get(e).toString().equals(cadenaComoArray.get(i).toString()))
		        {
		        	x++;
		        }
            }
            System.out.println(sinDuplicados.get(e)+" = "+x);
        }
	}

}
