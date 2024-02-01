// Clase que representa un producto fresco, hereda de Producto
public class ProductoFresco extends Producto {
    // Campos específicos para ProductoFresco
    private String fechaEnvasado;
    private String paisOrigen;

    // Constructor sin parámetros
    public ProductoFresco() {
    }

    // Constructor con parámetros que inicializa los campos específicos y llama al constructor de la clase base (Producto)
    public ProductoFresco(String fechaCaducidad, String numLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    // Constructor con parámetros que proporciona un valor predeterminado para el país de origen ("España")
    public ProductoFresco(String fechaCaducidad, String numLote, String fechaEnvasado) {
        // Llama al constructor con parámetros de la propia clase
        this(fechaCaducidad, numLote, fechaEnvasado, "España");
        /* Alternativamente, podrías hacerlo directamente en el constructor de la siguiente manera:
        super(fechaCaducidad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = "España"; */
    }

    // Métodos getter y setter para fechaEnvasado
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    // Métodos getter y setter para paisOrigen
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    // Sobrescribe el método toString para representar la información de ProductoFresco como una cadena
    @Override
    public String toString() {
        return super.toString() + " - Fecha envasado: " + fechaEnvasado + " - País origen: " + paisOrigen;
    }
}
