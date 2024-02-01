// Clase que representa una televisión, subclase de Electrodomestico
public class Television extends Electrodomestico {
    private double resolucion;
    private boolean tdt;

    // Constructor con parámetros que inicializa los atributos de la televisión y de la clase padre
    public Television(double precioBase, String color, char consumo, double peso, double resolucion, boolean tdt) {
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    // Constructor que utiliza valores por defecto para algunos atributos
    public Television(double precioBase, double peso) {
        this(precioBase, "blanco", 'F', peso, 20, false);
    }

    // Constructor por defecto que utiliza valores predefinidos
    public Television() {
        this(100, "blanco", 'F', 5, 20, false);
    }

    // Método para obtener la resolución de la televisión
    public double getResolucion() {
        return resolucion;
    }

    // Método para verificar si la televisión tiene TDT
    public boolean isTdt() {
        return tdt;
    }

    // Método toString para obtener una representación en cadena de la televisión
    @Override
    public String toString() {
        return super.toString() + " Television[ resolucion: " + resolucion + " - TDT: " + tdt + "]";
    }

    // Método para calcular el precio final de la televisión, considerando resolución y TDT
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40)
            precio *= 1.30;
        if (isTdt())
            precio += 50;
        return precio;
    }
}
