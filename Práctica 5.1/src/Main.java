import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        String nombre = scanner.next();
        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();
        System.out.println("Introduce el peso(KG):");
        double peso = scanner.nextDouble();
        System.out.println("Introduce la altura (m):");
        double altura = scanner.nextDouble();
        System.out.println("Introduce el sexo (h/m):");
        String genero = scanner.next();


        Persona A1 =new Persona(nombre,edad,peso,altura);
        A1.setSexo(A1.Comprobarsexo(genero.charAt(0)));
        System.out.println(A1);

        Persona A2 =new Persona("Federico",34, Sexo.hombre);
        System.out.println(A2);

        Persona A3 =new Persona();
        A3.setNombre("Alfonso");
        A3.setEdad(87);
        A3.setPeso(75);
        A3.setAltura(1.67);
        A3.setSexo(Sexo.hombre);
        System.out.println(A3);

        System.out.println("-----------------------------------");

        int IMC1 = A1.calcularIMC();
        if (IMC1==0){
            System.out.println(nombre+" tiene peso normal");
        } else if (IMC1==1) {
            System.out.println(nombre+" tiene sobrepeso");
        }else {
            System.out.println(nombre+" tiene bajo peso");
        }
        int IMC2 = A2.calcularIMC();
        if (IMC2==0){
            System.out.println(A2.getNombre()+" tiene peso normal");
        } else if (IMC2==1) {
            System.out.println(A2.getNombre()+" tiene sobrepeso");
        }else {
            System.out.println(A2.getNombre() + " tiene bajo peso");
        }
        int IMC3 = A3.calcularIMC();
        if (IMC3==0){
            System.out.println(A3.getNombre()+" tiene peso normal");
        } else if (IMC3==1) {
            System.out.println(A3.getNombre()+" tiene sobrepeso");
        }else {
            System.out.println(A3.getNombre()+" tiene bajo peso");
        }

        System.out.println("-----------------------------------");

        if (A1.MayorEdad()){
            System.out.println(nombre+" es mayor de edad");
        }else{
            System.out.println(nombre+" es menor de edad");
        }
        if (A2.MayorEdad()){
            System.out.println(A2.getNombre()+" es mayor de edad");
        }else{
            System.out.println(A2.getNombre()+" es menor de edad");
        }
        if (A3.MayorEdad()){
            System.out.println(A3.getNombre()+" es mayor de edad");
        }else{
            System.out.println(A3.getNombre()+" es menor de edad");
        }
    }
}