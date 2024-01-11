public class SerVivo {
    private byte edad;

    public SerVivo(byte edad) {

        this.edad = edad;
    }

    public byte getEdad() {

        return edad;
    }

    public void setEdad(byte edad) {

        this.edad = edad;
    }

    @Override
    public String toString(){

        return "\nEdad: "+ edad;
    }

    public boolean equals(SerVivo otro) {

        return this.edad == otro.edad;
    }

    public SerVivo mayor(SerVivo otro){
        SerVivo resultado;
        if (this.edad > otro.edad) {
            resultado = this;
        } else {
            resultado = otro;
        }
        return resultado;
    }
}