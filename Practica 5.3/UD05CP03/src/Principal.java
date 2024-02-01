// Clase principal que contiene el método main
public class Principal {
    public static void main(String[] args) {
        // Crear dos matrices de tamaño 3x3
        Matriz m1 = new Matriz(3);
        Matriz m2 = new Matriz(3);

        // Datos para la primera matriz (m1)
        int[] datos1 = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        m1.asignarDatos(datos1);

        // Datos para la segunda matriz (m2)
        int[] datos2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};
        m2.asignarDatos(datos2);

        // Mostrar la primera matriz (m1)
        System.out.println("MATRIZ 1");
        m1.mostrar();

        // Mostrar la segunda matriz (m2)
        System.out.println("MATRIZ 2");
        m2.mostrar();

        // Realizar la suma de las dos matrices y mostrar el resultado
        System.out.println("SUMA");
        m1.suma(m2);

        // Realizar el producto de las dos matrices y mostrar el resultado
        System.out.println("PRODUCTO");
        m1.producto(m2);
    }
}
