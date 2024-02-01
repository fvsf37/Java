// Clase que representa una cuenta bancaria
public class Cuenta {
    // Campos privados para el número de cuenta, saldo y propietario de la cuenta
    private String numCuenta;
    private double saldo;
    private Persona propietario;

    // Constructor sin parámetros
    public Cuenta() {
    }

    // Constructor con parámetros para inicializar el número de cuenta, saldo y propietario
    public Cuenta(String numCuenta, double saldo, Persona propietario) {
        this.numCuenta = numCuenta;
        // Llama al método setSaldo para validar y establecer el saldo
        this.setSaldo(saldo);
        this.propietario = propietario;
    }

    // Métodos para obtener y establecer el número de cuenta
    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    // Métodos para obtener y establecer el saldo de la cuenta
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        // Validación: el saldo no puede ser negativo
        if (saldo >= 0)
            this.saldo = saldo;
        else
            this.saldo = 0;
    }

    // Métodos para obtener y establecer el propietario de la cuenta
    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    // Sobrescribe el método toString para representar la información de la cuenta como una cadena
    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta='" + numCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario +
                '}';
    }

    // Método para realizar transacciones (ingresos o reintegros) en la cuenta
    public void transaccion(double cantidad, String tipo) {
        if (tipo.equals("ingreso") && cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingreso. El nuevo saldo es " + saldo);
        } else if (tipo.equals("reintegro") && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Reintegro. El nuevo saldo es " + saldo);
        } else {
            System.out.println("Transacción no autorizada");
        }
    }
}
