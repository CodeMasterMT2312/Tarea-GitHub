package Tarea_Github.Ejemplo2;

public class Empleados {
    private String nombre;
    private Integer edad;
    private Float salario;

    //Métodos constructores
    public Empleados(String nombre, Integer edad, Float salario)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleados()
    {
    }

    //Métodos
    public void mostrarInformaccion()
    {
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad +
                "\nSalario:" + salario);
    }

    public float calcularSalario(float ingreso, Integer horas)
    {
        float calculo = ingreso * horas;
        return calculo;
    }

}


class Gerente extends Empleados
{
    private String departamento;

    //Métodos constructores
    public Gerente(String nombre, Integer edad, Float salario, String departamento)
    {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public Gerente()
    {
    }

    //Métodos
    @Override
    public void mostrarInformaccion()
    {
        super.mostrarInformaccion();
        System.out.println("\nDepartamento: " + departamento);
    }

    public float calcularSalario(float ingreso, Integer horas, float bono)
    {
        return super.calcularSalario(ingreso, horas) + (bono/12);
    }
}


class Desarrollador extends Empleados
{
    private String lenguajePrincipal;

    //Método constructor
    public Desarrollador(String nombre, Integer edad, Float salario, String lenguajePrincipal)
    {
        super(nombre, edad, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public Desarrollador()
    {
    }

    //Métodos
    @Override
    public void mostrarInformaccion() {
        super.mostrarInformaccion();
        System.out.println("\nLenguaje principal: " + lenguajePrincipal);
    }

    public float calcularSalario(float ingreso, Integer horas, float bono) {
        return super.calcularSalario(ingreso, horas) + bono;
    }
}
