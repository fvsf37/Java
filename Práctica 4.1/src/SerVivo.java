// Clase base que representa a los seres vivos
public class SerVivo {
    // Campo privado para almacenar la edad del ser vivo
    private byte edad;

    // Constructor que inicializa la edad del ser vivo
    public SerVivo(byte edad) {
        this.edad = edad;
    }

    // Método para obtener la edad del ser vivo
    public byte getEdad() {
        return edad;
    }

    // Método para establecer la edad del ser vivo
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    // Sobrescribe el método toString para representar la información del objeto como una cadena
    @Override
    public String toString() {
        return "Edad: " + edad;
    }

    // Método equals para comparar la igualdad de dos seres vivos basado en la edad
    public boolean equals(SerVivo otro) {
        return this.edad == otro.edad;
    }

    // Método que devuelve el ser vivo que tiene mayor edad
    public SerVivo mayor(SerVivo otro) {
        SerVivo resultado;
        // Compara las edades para determinar el "mayor"
        if (this.edad > otro.edad)
            resultado = this;
        else
            resultado = otro;
        return resultado;
    }
}

