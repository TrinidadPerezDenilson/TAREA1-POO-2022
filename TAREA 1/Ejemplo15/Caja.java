package Ejemplo15;

class Caja

{

	double tamano;
	String color;
	String material;


public static void main(String[] args)
	{
		Caja caja = new Caja();

		 caja.tamano = 35.6;
		 caja.color = "Marron";
		 caja.material = "Carton";

		System.out.println(caja);

		System.out.println("el tamanio es: "+caja.tamano);

		System.out.println("el color es: "+caja.color);

		System.out.println("el material es: "+caja.material);

	}

}
