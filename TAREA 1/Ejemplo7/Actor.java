package Ejemplo7;

class Actor

{

    int edad;
    String nombre;
    String apellido;


    public static void main(String[] args)
    {
        Actor actor = new Actor();

        actor.edad = 25;
        actor.nombre = "juan";
        actor.apellido = "rojas";

        System.out.println(actor);

        System.out.println("la edad es: "+actor.edad);

        System.out.println("el nombre es: "+actor.nombre);

        System.out.println("el apellido es: "+actor.apellido);

    }

}