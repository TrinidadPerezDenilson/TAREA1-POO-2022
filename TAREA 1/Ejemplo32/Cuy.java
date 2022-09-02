package Ejemplo32;

class Cuy

{

    String nombre;
    int edad;
    String duenio;


public static void main(String[] args)
    {
        Cuy cuy = new Cuy();

         cuy.nombre = "Bardok";
         cuy.edad = 2;
         cuy.duenio = "Nilson";

        System.out.println(cuy);

        System.out.println("el nombre es: "+cuy.nombre);

        System.out.println("la edad es: "+cuy.edad);

        System.out.println("el duenio es: "+cuy.duenio);

    }

}
