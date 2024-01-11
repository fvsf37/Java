public class Cuenta {
        private String numeroCuenta;
        private double saldo;
        private Persona propietario;

        public Cuenta() {
        }

        public Cuenta(String numeroCuenta, double saldo, Persona propietario) {
            this.numeroCuenta = numeroCuenta;
            if (saldo >= 0) {
                this.saldo = saldo;
            } else {
                System.out.println("Saldo inválido.");
                this.saldo = 0.0;
            }
            this.propietario = propietario;
        }

        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(String numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            if (saldo >= 0) {
                this.saldo = saldo;
            } else {
                System.out.println("Saldo inválido.");
            }
        }

        public Persona getPropietario() {
            return propietario;
        }

        public void setPropietario(Persona propietario) {
            this.propietario = propietario;
        }

        @Override
        public String toString() {
            return "Cuenta: NumeroCuenta = " + numeroCuenta + ", saldo = " + saldo + ", Propietario = " + propietario;
        }

        public void transaccion(double cantidad, String tipoTransaccion) {

            if (tipoTransaccion.equalsIgnoreCase("reintegro")) {

                if (cantidad <= saldo && saldo>=0) {
                    saldo -= cantidad;
                    System.out.println("Reintegro de " + cantidad + " realizado. Nuevo saldo: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente para realizar el reintegro.");
                }
            } else if (tipoTransaccion.equalsIgnoreCase("ingreso")) {
                saldo += cantidad;
                System.out.println("Ingreso de " + cantidad + " realizado. Nuevo saldo: " + saldo);
            }
        }
    }
