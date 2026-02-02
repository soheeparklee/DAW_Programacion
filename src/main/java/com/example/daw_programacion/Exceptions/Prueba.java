import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor = 0 ;
		int dividendo = 10, cociente = 0;
		Scanner teclado = new Scanner (System.in);
		do
		{
	 	try
			{
			System.out.println("Escribe un num:");
			divisor = Integer.parseInt(teclado.nextLine()); //nfe = new NumberFormatExceptio()
	 	    cociente = dividendo/divisor;
		  
			}	
	 
			catch(NumberFormatException nfe)
			{
				System.out.println(nfe.getMessage());
				System.out.println("excepción del tipo numberformat");
			}
		 
			catch (ArithmeticException ae)
			{
				System.out.println(ae.getMessage());
				cociente = dividendo/1;
			}
	 	finally {
	 	    System.out.println(cociente);
	 	    System.out.println("fin");
	 	}
			

		}
		while (divisor >= 0);
    teclado.close();
	}

}
