package Tarea_Github.Ejemplo2;

import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //Empleado
        System.out.println("Empleado");
        Empleados empleado1 = new Empleados("Jose", 30, 1000f);
        empleado1.mostrarInformaccion();

        System.out.println("Indique el salario por horas del empleado: ");
        Scanner x = new Scanner(System.in);
        float porHora = x.nextFloat();
        System.out.println("Indique las horas que labora el empleado: ");
        Integer hora = x.nextInt();

        float dinero = empleado1.calcularSalario(porHora, hora);
        System.out.println("El salario del empleado es: " + dinero + "\n");

        //Gerente
        System.out.println("\nGerente");
        Gerente gerente1 = new Gerente("Pablo", 40, 5000f, "Marketing");
        gerente1.mostrarInformaccion();
        System.out.println("Indique el salario por horas del gerente: ");
        porHora = x.nextFloat();
        System.out.println("Indique las horas que labora el gerente: ");
        hora = x.nextInt();
        System.out.println("Indique el bono del gerente: ");
        float bono = x.nextFloat();
        dinero = gerente1.calcularSalario(porHora, hora, bono);
        System.out.println("El salario del gerente es: " + dinero + "\n");

        //Desarrollador
        System.out.println("\nDesarrollador");
        Desarrollador desarrollador1 = new Desarrollador("Juan", 25, 2000f, "C++");
        desarrollador1.mostrarInformaccion();

        System.out.println("Indique el salario por horas del desarrollador: ");
        porHora = x.nextFloat();
        System.out.println("Indique las horas que labora el desarrollador: ");
        hora = x.nextInt();
        System.out.println("Indique el bono del desarrollador: ");
        bono = x.nextFloat();
        dinero = desarrollador1.calcularSalario(porHora, hora, bono);
        System.out.println("El salario del desarrollador es: " + dinero + "\n");

    }
}
