public class Main {
    public static void main(String[] args) {
        // Crear una persona p0 con nombre "Pepito", apellidos "Grillo" y teléfono "4532"
        Persona p0 = new Persona("Pepito", "Grillo", "4532");

        // Crear una persona p1 sin parámetros y luego establecer nombre, apellidos y teléfono
        Persona p1 = new Persona();
        p1.setNombre("Juanita");
        p1.setApellidos("Campanilla");
        p1.setTelefono("987654321");

        // Crear una cuenta c0 con número "726734674", saldo -1200, y propietario p0
        Cuenta c0 = new Cuenta("726734674", -1200, p0);

        // Crear una cuenta c1 sin parámetros y luego establecer número, saldo, y propietario
        Cuenta c1 = new Cuenta();
        c1.setNumCuenta("762356778");
        c1.setSaldo(2500.50);
        c1.setPropietario(p1);

        // Imprimir la información de las cuentas antes de realizar transacciones
        System.out.println(c0);
        System.out.println(c1);

        // Realizar transacciones de ingreso en las cuentas c0 y c1
        c0.transaccion(250, "ingreso");
        c1.transaccion(105.64, "ingreso");

        // Imprimir la información de las cuentas después de las transacciones de ingreso
        System.out.println(c0);
        System.out.println(c1);

        // Intentar realizar transacciones no autorizadas en las cuentas c1 y c0
        c1.transaccion(-1200, "ingreso");
        c0.transaccion(1500, "reintegro");

        // Realizar transacciones de reintegro en las cuentas c1 y c0
        c1.transaccion(2000, "reintegro");

        // Imprimir la información de las cuentas después de las transacciones de reintegro
        System.out.println(c0);
        System.out.println(c1);
    }
}
