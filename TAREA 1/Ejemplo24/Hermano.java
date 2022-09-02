package Ejemplo24;

class Hermano

{

    String nombre;
    int edad;
    int dni;


public static void main(String[] args)
    {
        Hermano hermano = new Hermano();

         hermano.nombre = "Elvis";
         hermano.edad = 17;
         hermano.dni = 721306521;

        System.out.println(hermano);

        System.out.println("el nombre es: "+hermano.nombre);

        System.out.println("la edad es: "+hermano.edad);

        System.out.println("el dni es: "+hermano.dni);

    }

}

