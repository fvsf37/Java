import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de alumnos: ");
        int numAlum = sc.nextInt();

        // Crear un arreglo para almacenar las notas de los alumnos
        double[] notas = new double[numAlum];
        double promedio = 0;

        // Solicitar las notas de cada alumno y calcular el promedio
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");

            // Validar que la nota esté en el rango de 0 a 10
            do {
                notas[i] = sc.nextDouble();
            } while (notas[i] < 0 || notas[i] > 10);

            // Sumar las notas para calcular el promedio
            promedio += notas[i];
        }

        // Calcular el promedio dividiendo la suma de las notas entre el número de alumnos
        promedio = promedio / notas.length;
        System.out.println("La nota media es " + promedio);

        // Mostrar las notas de los alumnos que tienen una calificación por encima del promedio
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promedio)
                System.out.println("El alumno " + (i + 1) + " tiene una nota por encima de la media: " + notas[i]);
        }

        // Cerrar el Scanner
        sc.close();
    }
}
