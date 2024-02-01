// Clase base que representa un producto
public class Producto {
    // Campos para la fecha de caducidad y el número de lote del producto
    private String fechaCaducidad;
    private String numLote;

    // Constructor sin parámetros
    public Producto() {
    }

    // Constructor con parámetros que inicializa la fecha de caducidad y el número de lote
    public Producto(String fechaCaducidad, String numLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
    }

    // Métodos getter y setter para la fecha de caducidad
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    // Métodos getter y setter para el número de lote
    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }

    // Sobrescribe el método toString para representar la información del producto como una cadena
    @Override
    public String toString() {
        return "Producto " +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                " - numLote='" + numLote + '\'';
    }
}
