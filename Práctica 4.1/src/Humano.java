// Define una clase Humano que extiende la clase SerVivo
public class Humano extends SerVivo {
    // Campo privado para almacenar el nombre del humano
    private String nombre;

    // Constructor para la clase Humano, que toma la edad y el nombre como parámetros
    public Humano(byte edad, String nombre) {
        // Llama al constructor de la superclase (SerVivo) con el parámetro de la edad
        super(edad);
        // Establece el nombre del humano
        this.nombre = nombre;
    }

    // Método para obtener el nombre del humano
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre del humano
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Sobrescribe el método toString para representar la información del objeto como una cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + super.toString();
    }

    // Método equals para comparar la igualdad de dos objetos Humanos basado en edad y nombre
    public boolean equals(Humano otro) {
        return (this.getEdad() == otro.getEdad() && this.nombre.equals(otro.nombre));
    }

    // Método que devuelve el objeto SerVivo que tiene mayor longitud de nombre y mayor edad
    public SerVivo mayor(Humano otro) {
        SerVivo resultado;
        // Compara la longitud de los nombres y las edades para determinar el "mayor"
        if (this.nombre.length() > otro.nombre.length() && this.getEdad() > otro.getEdad())
            resultado = this;
        else
            resultado = otro;
        return resultado;
    }
}

