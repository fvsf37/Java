import java.util.Scanner;

// Clase principal que contiene el método main
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar información para la primera persona (p1)
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Sexo: ");
        char sexo = sc.nextLine().charAt(0);
        System.out.print("Peso: ");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.print("Altura: ");
        double altura = Double.parseDouble(sc.nextLine());

        // Crear la primera persona (p1) con la información proporcionada
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

        // Solicitar información para la segunda persona (p2)
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(sc.nextLine());
        System.out.print("Sexo: ");
        sexo = sc.nextLine().charAt(0);

        // Crear la segunda persona (p2) con la información proporcionada (valores predeterminados para peso y altura)
        Persona p2 = new Persona(nombre, edad, sexo);

        // Crear la tercera persona (p3) utilizando el constructor por defecto y establecer algunos valores manualmente
        Persona p3 = new Persona();
        p3.setNombre("Pepito");
        p3.setEdad(15);
        p3.setAltura(1.45);
        p3.setPeso(60);
        p3.setSexo('x');

        // Cerrar el scanner después de obtener la información
        sc.close();

        // Calcular el IMC y mostrar información para p1
        int ideal = p1.calcularIMC();
        mostrarResultadoIMC("P1", ideal);

        // Calcular el IMC y mostrar información para p2
        ideal = p2.calcularIMC();
        mostrarResultadoIMC("P2", ideal);

        // Calcular el IMC y mostrar información para p3
        ideal = p3.calcularIMC();
        mostrarResultadoIMC("P3", ideal);

        // Verificar si son mayores de edad y mostrar la información correspondiente
        mostrarEdad("P1", p1);
        mostrarEdad("P2", p2);
        mostrarEdad("P3", p3);

        // Mostrar la información completa de cada persona
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    // Método para mostrar el resultado del IMC para una persona
    private static void mostrarResultadoIMC(String nombrePersona, int resultado) {
        if (resultado == -1) {
            System.out.println(nombrePersona + " está por debajo de su peso ideal");
        } else if (resultado == 0) {
            System.out.println(nombrePersona + " está en su peso ideal");
        } else {
            System.out.println(nombrePersona + " tiene sobrepeso");
        }
    }

    // Método para mostrar si una persona es mayor o menor de edad
    private static void mostrarEdad(String nombrePersona, Persona persona) {
        if (persona.esMayorDeEdad()) {
            System.out.println(nombrePersona + " es mayor de edad");
        } else {
            System.out.println(nombrePersona + " es menor de edad");
        }
    }
}