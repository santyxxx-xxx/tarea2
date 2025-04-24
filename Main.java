//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre="", cargo="",fecha="";
        int salario=0;
        System.out.println("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el cargo: ");
        cargo = scanner.nextLine();
        System.out.println("Ingrese la fecha de su ingreso: ");
        fecha = scanner.nextLine();
        System.out.println("Ingrese el salario: ");
        salario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-------------Empleado 1--------------");
        Empleado e1= new Empleado(nombre,cargo,salario,fecha,100);
        e1.mostrar();
        System.out.println("-------------Empleado 2--------------");
        Empleado e2=new Empleado("Jose","Gerente",1500,"20/10/2005",100);
        e2.mostrar();
        System.out.println("-------------Empleado 3--------------");
        Empleado e3=new Empleado("Juan","Marketing",800,"31/1/2021",100);
        e3.mostrar();

    }
}
