public class Persona {
        private String nombre;
        private String apellido;
        private String telefono;

        public Persona(String nombre, String apellido, String telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            if (telefono.length() == 9) {
                this.telefono = telefono;
            } else {
                System.out.println("Número de teléfono inválido.");
                this.telefono = "";
            }
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            if (telefono.length() == 9) {
                this.telefono = telefono;
            } else {
                System.out.println("Número de teléfono inválido.");
            }
        }

        @Override
        public String toString() {
            return "Persona: Nombre = " + nombre + ", Apellido = " + apellido + ", Telefono = " + telefono;
        }
    }
