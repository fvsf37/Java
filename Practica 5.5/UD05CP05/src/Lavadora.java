// Clase que representa una lavadora, subclase de Electrodomestico
public class Lavadora extends Electrodomestico {
    private double carga;

    // Constructor con parámetros que inicializa los atributos de la lavadora y de la clase padre
    public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    // Constructor que utiliza valores por defecto para algunos atributos
    public Lavadora(double precioBase, double peso) {
        this(precioBase, "blanco", 'F', peso, 5);
    }

    // Constructor por defecto que utiliza valores predefinidos
    public Lavadora() {
        this(100, "blanco", 'F', 5, 5);
    }

    // Método para obtener la carga de la lavadora
    public double getCarga() {
        return carga;
    }

    // Método toString para obtener una representación en cadena de la lavadora
    @Override
    public String toString() {
        return super.toString() + " - Lavadora[ Carga: " + carga + "]";
    }

    // Método para calcular el precio final de la lavadora, considerando la carga
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 30)
            precio += 50;
        return precio;
    }
}
