public class Humano extends SerVivo {
    private String nombre;

    public Humano(byte edad, String nombre) {
        super(edad);
        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    @Override
    public  String toString(){
        return "Nombre: "+nombre+super.toString();
    }

    public boolean equals(Humano otro){
        return (this.getEdad() == otro.getEdad() && this.nombre.equals(otro.nombre));
    }

    public SerVivo mayor(Humano otro){
        SerVivo resultado;
        if (this.nombre.length()>otro.nombre.length() && this.getEdad()>otro.getEdad()) {
            resultado = this;
        }else {
            resultado = otro;
        }
        return resultado;
    }
}
