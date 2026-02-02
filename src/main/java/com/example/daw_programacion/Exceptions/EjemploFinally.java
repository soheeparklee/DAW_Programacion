public class EjemploFinally {
	
	public static int cuadrado (StringBuffer s)
	{
		 int y = 0;
		 String con;
		 try
		 {
			 con = s.toString();
			 y = Integer.parseInt(con);
			 y = y*y;
			 return y;
		 }
		 catch (NumberFormatException e)
		 {
			 System.out.println(e.getMessage());
			 return 0;
		 }

		 finally
		 {
			 s.delete(0, s.length());
			 s.append("fin");
		 }
		
	}

}
