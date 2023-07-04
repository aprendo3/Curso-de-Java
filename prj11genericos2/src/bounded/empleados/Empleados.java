package bounded.empleados;

import java.util.List;

public class Empleados<T extends Persona> {
    List<T> listaDeEmpleados;
    public Empleados(List<T> listaDeEmpleados) {
        this.listaDeEmpleados = listaDeEmpleados;
    }
    public void listar() {
        listaDeEmpleados.forEach(empleado -> System.out.println(empleado.getNombre()));
    }
    public static void main(String[] args) {
        List<Empleado> lista = List.of(new Empleado("Carlos"), new Empleado("Maria"));
        Empleados<Empleado> empleados = new Empleados<>(lista);
        empleados.listar();
    }
}
