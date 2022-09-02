package Ejemplo19;

class Alumno

{

    int codigo;
    String nombre;
    int dni;


public static void main(String[] args)
    {
        Alumno alumno = new Alumno();

         alumno.codigo = 123;
         alumno.nombre = "Nilson";
         alumno.dni = 71306521;

        System.out.println(alumno);

        System.out.println("el codigo es: "+alumno.codigo);

        System.out.println("el nombre es: "+alumno.nombre);

        System.out.println("el dni es: "+alumno.dni);

    }

}
