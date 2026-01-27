package com.example.daw_programacion.OOP.Ejercicio_4.Ej13;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        Robot r = new Robot();
        RobotExplorador re = new RobotExplorador();
        RobotMantenimiento rm = new RobotMantenimiento();

        robots.add(r);
        robots.add(re);
        robots.add(rm);

        for (Robot robot : robots) {
            robot.mover();
        }
    }
}
