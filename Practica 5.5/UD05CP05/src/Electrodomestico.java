// Enumeración para representar los colores posibles
public enum Color {
    blanco, negro, rojo, azul, gris
}

// Enumeración para representar los niveles de consumo energético
public enum Consumo {
    A, B, C, D, E, F
}

// Clase base que representa un electrodoméstico
public class Electrodomestico {
    private double precioBase;
    private Color color;
    private Consumo consumo;
    private double peso;

    // Constructor con parámetros que inicializa los atributos del electrodoméstico
    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        this.comprobarColor(color);
        this.comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    // Constructor que utiliza valores por defecto para algunos atributos
    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, "blanco", 'F', peso);
    }

    // Constructor por defecto que utiliza valores predefinidos
    public Electrodomestico() {
        this(100, "blanco", 'F', 5);
    }

    // Método para obtener el precio base del electrodoméstico
    public double getPrecioBase() {
        return precioBase;
    }

    // Método para establecer el precio base del electrodoméstico
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    // Método para obtener el color del electrodoméstico
    public Color getColor() {
        return color;
    }

    // Método para establecer el color del electrodoméstico
    public void setColor(Color color) {
        this.color = color;
    }

    // Método para obtener el nivel de consumo del electrodoméstico
    public Consumo getConsumo() {
        return consumo;
    }

    // Método para establecer el nivel de consumo del electrodoméstico
    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    // Método para obtener el peso del electrodoméstico
    public double getPeso() {
        return peso;
    }

    // Método para establecer el peso del electrodoméstico
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método toString para obtener una representación en cadena del electrodoméstico
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }

    // Método privado para comprobar y asignar el nivel de consumo energético
    private void comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A' -> this.consumo = Consumo.A;
            case 'B' -> this.consumo = Consumo.B;
            case 'C' -> this.consumo = Consumo.C;
            case 'D' -> this.consumo = Consumo.D;
            case 'E' -> this.consumo = Consumo.E;
            default -> this.consumo = Consumo.F;
        }
    }

    // Método privado para comprobar y asignar el color
    private void comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "negro" -> this.color = Color.negro;
            case "rojo" -> this.color = Color.rojo;
            case "azul" -> this.color = Color.azul;
            case "gris" -> this.color = Color.gris;
            default -> this.color = Color.blanco;
        }
    }

    // Método para calcular el precio final del electrodoméstico
    public double precioFinal() {
        double precioFinal = precioBase;

        // Ajustar el precio final según el nivel de consumo
        switch (consumo) {
            case A -> precioFinal += 100;
            case B -> precioFinal += 80;
            case C -> precioFinal += 60;
            case D -> precioFinal += 50;
            case E -> precioFinal += 30;
            case F -> precioFinal += 10;
        }

        // Ajustar el precio final según el peso
        if (peso >= 0 && peso < 20)
            precioFinal += 10;
        else if (peso >= 20 && peso < 50)
            precioFinal += 50;
        else if (peso >= 50 && peso < 80)
            precioFinal += 80;
        else
            precioFinal += 100;

        return precioFinal;
    }
}
