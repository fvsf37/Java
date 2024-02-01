// Clase que representa un producto congelado, hereda de Producto
public class ProductoCongelado extends Producto {
    // Campo específico para ProductoCongelado
    private double temperatura;

    // Constructor sin parámetros
    public ProductoCongelado() {
    }

    // Constructor con parámetros que inicializa el campo específico y llama al constructor de la clase base (Producto)
    public ProductoCongelado(String fechaCaducidad, String numLote, double temperatura) {
        super(fechaCaducidad, numLote);
        this.temperatura = temperatura;
    }

    // Métodos getter y setter para la temperatura de congelación
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    // Sobrescribe el método toString para representar la información de ProductoCongelado como una cadena
    @Override
    public String toString() {
        return super.toString() + " - Temperatura de congelación: " + temperatura;
    }
}
