package com.example.daw_programacion.Iterator;


import java.util.ArrayList;
import java.util.Iterator;

public class Recorrido {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Alumno> alumnos = new ArrayList<Alumno> ();

        Alumno al1 = new Alumno(1,"Ana","Blanco");
        Alumno al2 = new Alumno(2,"Pedro","Picapiedra");
        Alumno al3 = new Alumno(3,"Pablo","Marmol");
        Alumno al4 = new Alumno(4,"Eva","Rojo");
        Alumno al5 = new Alumno(1,"Ana","Blanco");

        alumnos.add(al1);
        alumnos.add(al5);
        alumnos.add(al3);
        alumnos.add(al4);
        alumnos.add(al2);

        Alumno ana = new Alumno (1,"Ana","Blanco");
/*
		for (int i = 0; i < alumnos.size();i++)
		{
			if (alumnos.get(i).getnExp() == ana.getnExp() )
			{

				alumnos.remove(ana);
			}
            System.out.print(i);
            System.out.println(alumnos);
			//System.out.println(alumnos.get(i).toString());
		}
		*/


/*
		for (Alumno al: alumnos)
		{

			if (al.getnExp() == ana.getnExp() )
			{
				alumnos.remove(ana);
			}
			System.out.println(al.toString());
		}
		*/



        Iterator <Alumno> iterator = alumnos.iterator();
        while(iterator.hasNext())
        {
            Alumno alum = iterator.next();
            if (alum.getnExp() == ana.getnExp() )
            {
                iterator.remove();
            }
        }

        for (Alumno alumno : alumnos)
        {
            System.out.println(alumnos.toString());
        }



    }

}
