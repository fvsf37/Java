import java.util.Date;

public class Producto {
    private String fechacaducidad;
    private String numerolote;

    public Producto() {
    }

    public Producto(String fechacaducidad, String numerolote) {
        this.fechacaducidad = fechacaducidad;
        this.numerolote = numerolote;
    }

    public String getFechacaducidad() {

        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {

        this.fechacaducidad = fechacaducidad;
    }

    public String getNumerolote() {

        return numerolote;
    }

    public void setNumerolote(String numerolote) {

        this.numerolote = numerolote;
    }
}


