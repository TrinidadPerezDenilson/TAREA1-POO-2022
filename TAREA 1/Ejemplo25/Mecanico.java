package Ejemplo25;

class Mecanico

{

    String nombre;
    String apellidos;
    int salario;


public static void main(String[] args)
    {
        Mecanico mecanico = new Mecanico();

         mecanico.nombre = "Pepe";
         mecanico.apellidos = "Lopez";
         mecanico.salario = 1000;

        System.out.println(mecanico);

        System.out.println("el nombre es: "+mecanico.nombre);

        System.out.println("el apellidos es: "+mecanico.apellidos);

        System.out.println("el salario es: "+mecanico.salario);

    }

}
