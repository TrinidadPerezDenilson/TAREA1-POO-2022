package Ejemplo20;

class Madre

{

    String nombre;
    int edad;
    int dni;


public static void main(String[] args)
    {
        Madre madre = new Madre();

         madre.nombre = "Stella";
         madre.edad = 30;
         madre.dni = 721306521;

        System.out.println(madre);

        System.out.println("el nombre es: "+madre.nombre);

        System.out.println("la edad es: "+madre.edad);

        System.out.println("el dni es: "+madre.dni);

    }

}

