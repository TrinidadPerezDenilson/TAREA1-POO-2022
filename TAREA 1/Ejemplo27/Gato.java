package Ejemplo27;

class Gato

{

    String nombre;
    int edad;
    String duenio;


public static void main(String[] args)
    {
        Gato gato = new Gato();

         gato.nombre = "Bardok";
         gato.edad = 2;
         gato.duenio = "Nilson";

        System.out.println(gato);

        System.out.println("el nombre es: "+gato.nombre);

        System.out.println("la edad es: "+gato.edad);

        System.out.println("el duenio es: "+gato.duenio);

    }

}
