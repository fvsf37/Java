import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private double peso;
    private double altura;
    private Sexo sexo;

    public Persona(){
        nombre = "Fer";
        edad = 39;
        peso = 85.5;
        altura = 178.84;
        sexo = Sexo.hombre;
        DNI = GeneraDNI();
    }

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = Sexo.hombre;
        this.peso = 65;
        this.altura = 2.04;
        DNI = GeneraDNI();
    }

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        DNI = GeneraDNI();
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                " Nombre=" + nombre +
                ", Edad=" + edad +
                ", DNI=" + DNI +
                ", Peso=" + peso + " KG" +
                ", Altura=" + altura + " m" +
                ", Sexo=" + sexo +
                '}';
    }
    public int calcularIMC() {
        double imc = peso / (altura*altura);
        if (imc < 18.5) {
            return -1;
        } else if (imc >= 18.5 && imc < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean MayorEdad(){
        return edad >= 18;
    }

    public Sexo Comprobarsexo (char genero){
        if(genero == 'm'){
            return sexo.mujer;
        }else{
            return sexo.hombre;
        }
    }

    static private Random r = new Random();
    private String GeneraDNI(){
        int DNI = r.nextInt(99999999)+1;
        int posicion = DNI % 23;
        char[] letras ={'T','R','W','A','G','M','Y',
                'F','P','D','X','B','N','J','Z','S','Q',
                'V','H','L','C','K','E'};
        return (Integer.toString(DNI)+letras[posicion]);
    }
}


