import java.util.Scanner;

// Clase principal que contiene el método main
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario el número de bolas blancas y negras inicialmente en la urna
        System.out.print("Número de bolas blancas? ");
        int blancas = sc.nextInt();
        System.out.print("Número de bolas negras? ");
        int negras = sc.nextInt();

        // Cerrar el Scanner después de recibir la entrada
        sc.close();

        // Crear un objeto Urna con la cantidad inicial de bolas blancas y negras
        Urna urna = new Urna(blancas, negras);

        // Realizar el proceso hasta que quede solo una bola en la urna
        while (urna.totalBolas() > 1) {
            // Extraer dos bolas de la urna
            Color bola1 = urna.bola();
            Color bola2 = urna.bola();

            // Mostrar las bolas extraídas
            System.out.println("Sacamos una bola " + bola1 + " y otra bola " + bola2);

            // Determinar qué tipo de bola se añadirá a la urna y realizar la adición
            if (bola1 == bola2) {
                urna.ponerBlanca();
                System.out.println("Añadimos una bola blanca");
            } else {
                urna.ponerNegra();
                System.out.println("Añadimos una bola negra");
            }

            // Mostrar la cantidad actual de bolas en la urna
            System.out.println("En la urna hay " + urna.blancas + " bolas blancas, y " + urna.negras +
                    " bolas negras. En total:" + urna.totalBolas() + " bolas");
        }

        // Mostrar el color de la última bola que queda en la urna
        System.out.println("La bola que queda es de color: " + urna.bola());
    }
}
