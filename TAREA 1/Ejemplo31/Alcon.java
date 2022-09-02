package Ejemplo31;

class Alcon

{

    String nombre;
    int edad;
    String duenio;


public static void main(String[] args)
    {
        Alcon alcon = new Alcon();

         alcon.nombre = "Boo";
         alcon.edad = 2;
         alcon.duenio = "Nilson";

        System.out.println(alcon);

        System.out.println("el nombre es: "+alcon.nombre);

        System.out.println("la edad es: "+alcon.edad);

        System.out.println("el duenio es: "+alcon.duenio);

    }

}
