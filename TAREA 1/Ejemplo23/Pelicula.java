package Ejemplo23;

class Pelicula

{

    String nombre;
    int anio;
    String genero;


public static void main(String[] args)
    {
        Pelicula pelicula = new Pelicula();

         pelicula.nombre = "Stella";
         pelicula.anio = 2000;
         pelicula.genero = "Terro";

        System.out.println(pelicula);

        System.out.println("el nombre es: "+pelicula.nombre);

        System.out.println("el anio es: "+pelicula.anio);

        System.out.println("el genero es: "+pelicula.genero);

    }

}

