// Clase principal que contiene el método main
public class Principal {
    public static void main(String[] args) {
        // Crear un array de Electrodomesticos con 10 elementos
        Electrodomestico[] e = new Electrodomestico[10];

        // Inicializar el array con diferentes instancias de Electrodomesticos, Lavadoras y Televisiones
        e[0] = new Electrodomestico();
        e[1] = new Electrodomestico(300, 25);
        e[2] = new Electrodomestico(400, 55);
        e[3] = new Electrodomestico(1100, "azul", 'B', 44);
        e[4] = new Lavadora();
        e[5] = new Lavadora(550, 40);
        e[6] = new Lavadora(750, "gris", 'A', 55, 35);
        e[7] = new Television();
        e[8] = new Television(1500, 15);
        e[9] = new Television(1800, "negro", 'B', 20, 65, true);

        // Variables para almacenar los precios totales de Electrodomesticos, Lavadoras y Televisiones
        double precioEle = 0;
        double precioLav = 0;
        double precioTv = 0;

        // Recorrer el array de Electrodomesticos
        for (int i = 0; i < e.length; i++) {
            // Calcular y mostrar el precio final de cada Electrodomestico
            precioEle += e[i].precioFinal();
            System.out.println(e[i]);

            // Verificar si el elemento es una Lavadora y calcular su precio final
            if (e[i] instanceof Lavadora)
                precioLav += ((Lavadora) e[i]).precioFinal();

            // Verificar si el elemento es una Television y calcular su precio final
            if (e[i] instanceof Television)
                precioTv += ((Television) e[i]).precioFinal();
        }

        // Mostrar el precio total de los Electrodomesticos, Lavadoras y Televisiones
        System.out.println("Precio total de los electrodomésticos: " + precioEle);
        System.out.println("Precio total de las lavadoras: " + precioLav);
        System.out.println("Precio total de las televisiones: " + precioTv);
    }
}
