// Clase que representa una matriz cuadrada de enteros
public class Matriz {
    private int[][] matriz;

    // Constructor que inicializa la matriz con dimensiones dim x dim
    public Matriz(int dim) {
        matriz = new int[dim][dim];
    }

    // Método para asignar datos a la matriz a partir de un vector
    public void asignarDatos(int[] vector) {
        if (vector.length == matriz.length * matriz.length) {
            int indice = 0;
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz[fila].length; columna++) {
                    matriz[fila][columna] = vector[indice];
                    indice++;
                }
            }
        }
    }

    // Método para realizar la suma de dos matrices
    public void suma(Matriz m) {
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print("( ");
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + m.matriz[fila][columna] + " ");
            }
            System.out.println(")");
        }
    }

    // Método para mostrar la matriz
    public void mostrar() {
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.print("( ");
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println(")");
        }
    }

    // Método para obtener una fila específica de la matriz
    public int[] dameFila(int fila) {
        int[] resultado = new int[matriz.length];
        for (int columna = 0; columna < matriz[fila].length; columna++) {
            resultado[columna] = matriz[fila][columna];
        }
        return resultado;
    }

    // Método para obtener una columna específica de la matriz
    public int[] dameColumna(int columna) {
        int[] resultado = new int[matriz.length];
        for (int fila = 0; fila < matriz.length; fila++) {
            resultado[fila] = matriz[fila][columna];
        }
        return resultado;
    }

    // Método para realizar el producto de dos matrices
    public void producto(Matriz m){
        for (int fila = 0; fila < matriz.length ; fila++) {
            System.out.print("( ");
            for (int columna = 0; columna < m.matriz[fila].length ; columna++) {
                int[] f1 = dameFila(fila);
                int[] c1 = m.dameColumna(columna);
                int resultado=0;
                for (int indice = 0; indice < f1.length; indice++) {
                    resultado+=f1[indice]*c1[indice];
                }
                System.out.print(resultado+" ");
            }
            System.out.println(")");
        }
    }
}
