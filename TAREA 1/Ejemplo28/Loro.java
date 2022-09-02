package Ejemplo28;

class Loro

{

    String nombre;
    int edad;
    String duenio;


public static void main(String[] args)
    {
        Loro loro = new Loro();

         loro.nombre = "Bardok";
         loro.edad = 2;
         loro.duenio = "Nilson";

        System.out.println(loro);

        System.out.println("el nombre es: "+loro.nombre);

        System.out.println("la edad es: "+loro.edad);

        System.out.println("el duenio es: "+loro.duenio);

    }

}
