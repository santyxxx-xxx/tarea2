public class Empleado {
    String nombre;
    String cargo;
    String fecha;
    int salario;
    public Empleado(String nombre, String cargo, int salario, String fecha) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha = fecha;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha: " + fecha);

    }
}
