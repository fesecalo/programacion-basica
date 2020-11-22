package main;

public class Main {
	
	static int[] myArray = {13,2,4,35,1};

	public static void main(String[] args) {
		
		int max=0;
		for(int e=0; e<myArray.length;e++)
		{
			for(int i=0; i<myArray.length;i++)
			{
				if(myArray[e]>=myArray[i]&&myArray[e]>=max)
				{
					max=myArray[e];
				}
			}
		}
		
		System.out.println(max);

	}

}
