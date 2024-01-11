public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona(" Juan", " Perez", "123456789");
        Persona persona2 = new Persona(" Maria", " Gomez", "987654321");

        Cuenta cuenta1 = new Cuenta(" 001", 10000.0, persona1);
        Cuenta cuenta2 = new Cuenta(" 002", 50000.0, persona2);

        cuenta1.transaccion(100000000.0, "reintegro");
        cuenta2.transaccion(2000.0, "ingreso");

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(cuenta1);
        System.out.println(cuenta2);

}
}