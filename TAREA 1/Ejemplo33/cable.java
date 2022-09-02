class cable

{

    int medida;
    String marca;
    String material;


    public static void main(String[] args)
    {
        cable cable = new cable();

        cable.medida = 14;
        cable.marca = "indeco";
        cable.material = "cobre";

        System.out.println(cable);

        System.out.println("la  medida es: "+cable.medida);

        System.out.println("la marca es: "+cable.marca);

        System.out.println("el material es: "+cable.material);

    }
}
