public class Empleado {
    String nombre;
    String cargo;
    String fecha;
    int salario;
    int num;
    public Empleado(String nombre, String cargo, int salario, String fecha,int num) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha = fecha;
        this.num = num;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha: " + fecha);
        System.out.println("Num: " + num);

    }
}
