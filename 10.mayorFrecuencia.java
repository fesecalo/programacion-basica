package FrecuenciaDelMismoNumero;

public class FrecuenciaDelMismoNumero {

	static int[] myArray = {5,5,1,2,2,5,3,3,1,1};

	public static void main(String[] args) {
		
		int frec = 0;
		int num = 0;
		
		for(int e=0; e<10;e++)
		{
			int rep = 0;
			for(int i=0; i<10;i++)
			{
				if(myArray[e]==myArray[i])
				{
					rep++;
				}
				if(rep>frec)
				{
					frec=rep;
					num=myArray[e];
				}
			}
		}
		
		System.out.println("Rep: "+frec);
		System.out.println("Val: "+num);
		

	}

}
