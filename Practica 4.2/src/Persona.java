// Clase que representa a una persona con nombre, apellidos y teléfono
public class Persona {
    // Campos privados para almacenar el nombre, apellidos y teléfono de la persona
    private String nombre;
    private String apellidos;
    private String telefono;

    // Constructor sin parámetros
    public Persona() {
    }

    // Constructor con parámetros para inicializar nombre, apellidos y teléfono
    public Persona(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        // Llama al método setTelefono para validar y establecer el teléfono
        this.setTelefono(telefono);
    }

    // Métodos para obtener y establecer el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener y establecer los apellidos de la persona
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Métodos para obtener y establecer el teléfono de la persona
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        // Validación: el teléfono debe tener longitud 9, de lo contrario se establece a "000000000"
        if (telefono.length() == 9)
            this.telefono = telefono;
        else
            this.telefono = "000000000";
    }

    // Sobrescribe el método toString para representar la información de la persona como una cadena
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
