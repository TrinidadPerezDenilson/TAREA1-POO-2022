class llanta

{

    int medida;
    String marca;
    String material;


    public static void main(String[] args)
    {
        llanta llanta = new llanta();

        llanta.medida = 160;
        llanta.marca = "dumlop";
        llanta.material = "caucho";

        System.out.println(llanta);

        System.out.println("la  medida es: "+llanta.medida);

        System.out.println("la marca es: "+llanta.marca);

        System.out.println("el material es: "+llanta.material);

    }
}
