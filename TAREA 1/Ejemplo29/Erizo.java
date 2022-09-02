package Ejemplo29;

class Erizo

{

    String nombre;
    int edad;
    String duenio;


public static void main(String[] args)
    {
        Erizo erizo = new Erizo();

         erizo.nombre = "Bardok";
         erizo.edad = 2;
         erizo.duenio = "Nilson";

        System.out.println(erizo);

        System.out.println("el nombre es: "+erizo.nombre);

        System.out.println("la edad es: "+erizo.edad);

        System.out.println("el duenio es: "+erizo.duenio);

    }

}
