package Tarea_Github.Ejemplo1;

public class Main_Figuras {
    public static void main(String[] args) {
        Rectangulo figura1 = new Rectangulo("Green",8.5,16.2);
        figura1.calcularArea();
        figura1.calcularPerimetro();
        System.out.println("\n");
        Triangulo figura2 = new Triangulo("Red",6.00,9.00,10.00);
        figura2.calcularArea();
        figura2.calcularPerimetro();
    }
}
