package Tarea_Github.Ejemplo1;

public class Figura {
    //Atributos
    String Color;

    public Figura(String color) {
        this.Color=color;
    }
    //Metodos
    public void calcularArea(){
    }
    public void calcularPerimetro(){
    }
}
class Rectangulo extends Figura {
    //Atributos
    Double lado_A;
    Double lado_B;

    //Constructor


    public Rectangulo(String color, Double lado_B, Double lado_A) {
        super(color);
        this.lado_B = lado_B;
        this.lado_A = lado_A;
    }

    //Metodos
    public void calcularArea(){
        System.out.println("El area del rectangulo es: "+lado_A*lado_B);
    }
    public void calcularPerimetro(){
        System.out.println("El perimetro del rectangulo es: "+2*(lado_A+lado_B));
    }
}
class Triangulo extends Figura {
    //Atributos
    Double Base;
    Double Altura;
    Double lado_A;

    //Constructor

    public Triangulo(String color, Double base, Double lado_A, Double altura) {
        super(color);
        Base = base;
        this.lado_A = lado_A;
        Altura = altura;
    }

    //Metodos
    public void calcularArea(){
        System.out.println("El area del triangulo es: "+(Base*Altura)/2);
    }
    public void calcularPerimetro(){
        System.out.println("El perimetro del triangulo es: "+(lado_A+Base+Altura));
    }
}
