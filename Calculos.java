package view;

import model.Paralelogramo;
import model.Quadrilatero;
import model.Trapezio;

public class Calculos {
    public static void main(String[] args) {
        Paralelogramo paralelogramo = new Paralelogramo(5, 3);
        System.out.println("Área do Paralelogramo: " + paralelogramo.calcArea());
        System.out.println("Perímetro do Paralelogramo: " + paralelogramo.calcPerimetro());

        Trapezio trapezio = new Trapezio(6, 4, 3);
        System.out.println("\nÁrea do Trapézio: " + trapezio.calcArea());
        System.out.println("Perímetro do Trapézio: " + trapezio.calcPerimetro());
    }
}
