package Ejemplo21;

class Hijo

{

    String nombre;
    String apodo;
    int edad;


public static void main(String[] args)
    {
        Hijo hijo = new Hijo();

         hijo.nombre = "Nilson";
         hijo.apodo = "Triple X";
         hijo.edad = 19;

        System.out.println(hijo);

        System.out.println("el nombre es: "+hijo.nombre);

        System.out.println("el apodo es: "+hijo.apodo);

        System.out.println("la edad es: "+hijo.edad);

    }

}
