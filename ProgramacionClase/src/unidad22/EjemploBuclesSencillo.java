package unidad22;

public class EjemploBuclesSencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		/*
		while (num>=0)
		{
			System.out.println(num);
			--num;
		}
		System.out.println("Despegue");
		*/
		
		
		
		//Mostrar los números pares entre 0 y 50
		
		
		/*
		while (num<=50)
		{
			//if (num%2==0) System.out.println(num);
			//num++;
		
			//Al ponerlo de esta forma es mas optimo dado que realiza menos operaciones
			if (num%2==0) System.out.println(num);
			num=num+2;
		}
		*/
		
		
		
		//Version for del mismo problema
		
		/*for (int i=0;i<=50;i++)
		{
			if (i%2==0) System.out.println(i);
		}*/
		for (int i=0;i<=50;i=i+2)
		{
			if (i%2==0) System.out.println(i);
		}
		
		
	}

}
