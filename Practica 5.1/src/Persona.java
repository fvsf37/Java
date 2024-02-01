import java.util.Random;

// Enumeración para representar el sexo de la persona
enum Sexo {
    H, M
}

// Clase que representa a una persona
public class Persona {

    // Atributos de la clase
    private String nombre;
    private int edad;
    private String DNI;
    private Sexo sexo;
    private double peso;
    private double altura;

    // Constructor principal con todos los parámetros
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    // Constructor que permite crear una persona con nombre, edad y sexo (valores por defecto para peso y altura)
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 65, 1.75);
    }

    // Constructor por defecto que crea una persona con valores predefinidos
    public Persona() {
        this("Pepito", 15, 'H', 65, 1.75);
    }

    // Métodos setter para actualizar los atributos de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el IMC (Índice de Masa Corporal) de la persona
    public int calcularIMC() {
        int resultado;
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            resultado = -1;
        } else if (imc >= 18.5 && imc < 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    // Método para verificar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método toString para representar la información de la persona como una cadena
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    // Método privado para comprobar y asignar el sexo de la persona
    private void comprobarSexo(char sexo) {
        if (sexo == 'm' || sexo == 'M')
            this.sexo = Sexo.M;
        else
            this.sexo = Sexo.H;
    }

    // Método privado para generar automáticamente un DNI para la persona
    private void generaDNI() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        Random r = new Random();
        int dniNum = r.nextInt(100000000);
        String dni = "" + dniNum;
        if (dni.length() < 8) {
            // Rellenar con ceros por la izquierda
            for (int i = 1; i <= (8 - dni.length()); i++) {
                dni = "0" + dni;
            }
        }
        int posicion = dniNum % 23;
        String letra = "" + letras.charAt(posicion);
        this.DNI = dni + letra;
    }
}
