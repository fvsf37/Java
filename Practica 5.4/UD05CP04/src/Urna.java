import java.util.Random;

// Clase que representa una urna con bolas blancas y negras
public class Urna {
    protected int blancas;
    protected int negras;

    // Constructor que inicializa la urna con una cantidad inicial de bolas blancas y negras
    public Urna(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;
    }

    // Método que devuelve el total de bolas en la urna
    public int totalBolas(){
        return blancas + negras;
    }

    // Método para añadir una bola blanca a la urna
    public void ponerBlanca(){
        blancas++;
    }

    // Método para añadir una bola negra a la urna
    public void ponerNegra(){
        negras++;
    }

    // Método para extraer una bola al azar de la urna
    public Color bola(){
        Color resultado;
        Random r = new Random();
        int aleatorio = r.nextInt(totalBolas()) + 1;

        // Determinar el color de la bola extraída y ajustar la cantidad correspondiente
        if (aleatorio <= blancas) {
            resultado = Color.Blanca;
            blancas--;
        } else {
            resultado = Color.Negra;
            negras--;
        }

        return resultado;
    }
}
