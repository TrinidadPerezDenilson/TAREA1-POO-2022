package Ejemplo22;

class Empleados

{

    String nombre;
    String cargo;
    int edad;


public static void main(String[] args)
    {
        Empleados empleados = new Empleados();

         empleados.nombre = "Stella";
         empleados.cargo = "Docente";
         empleados.edad = 22;

        System.out.println(empleados);

        System.out.println("el nombre es: "+empleados.nombre);

        System.out.println("el cargo es: "+empleados.cargo);

        System.out.println("la edad es: "+empleados.edad);

    }

}
