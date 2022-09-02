package Ejemplo26;

class Perro

{

    String nombre;
    int edad;
    String duenio;


public static void main(String[] args)
    {
        Perro perro = new Perro();

         perro.nombre = "Bardok";
         perro.edad = 2;
         perro.duenio = "Nilson";

        System.out.println(perro);

        System.out.println("el nombre es: "+perro.nombre);

        System.out.println("la edad es: "+perro.edad);

        System.out.println("el duenio es: "+perro.duenio);

    }

}
