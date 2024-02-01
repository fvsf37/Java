public class Main {
    public static void main(String[] args) {
        // Crear dos objetos SerVivo con edades diferentes
        SerVivo x = new SerVivo((byte) 3);
        SerVivo y = new SerVivo((byte) 5);

        // Imprimir el resultado del método mayor en el objeto x (SerVivo)
        System.out.println(x.mayor(y));

        // Crear dos objetos Humano con edades y nombres diferentes
        x = new Humano((byte) 34, "Homero");
        y = new Humano((byte) 9, "Bart");

        // Convertir los objetos SerVivo a Humano (casting)
        Humano hx = (Humano) x;
        Humano hy = (Humano) y;

        // Imprimir el resultado del método mayor en el objeto hx (Humano)
        System.out.println(hx.mayor(hy));

        // Comprobar si el resultado del método mayor es igual a hx (Humano)
        if (((Humano) (hx.mayor(hy))).equals(hx))
            System.out.println("Menor: " + hy);
        else
            System.out.println("Menor: " + hx);
    }
}
