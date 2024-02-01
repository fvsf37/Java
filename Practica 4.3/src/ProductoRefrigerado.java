// Clase que representa un producto refrigerado, hereda de Producto
public class ProductoRefrigerado extends Producto {
    // Campo específico para ProductoRefrigerado
    private String codigo;

    // Constructor sin parámetros
    public ProductoRefrigerado() {
    }

    // Constructor con parámetros que inicializa el campo específico y llama al constructor de la clase base (Producto)
    public ProductoRefrigerado(String fechaCaducidad, String numLote, String codigo) {
        super(fechaCaducidad, numLote);
        this.codigo = codigo;
    }

    // Métodos getter y setter para el código de supervisión
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Sobrescribe el método toString para representar la información de ProductoRefrigerado como una cadena
    @Override
    public String toString() {
        return super.toString() + " - Código de supervisión: " + codigo;
    }
}
