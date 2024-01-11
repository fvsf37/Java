import java.util.Date;

public class ProductoFresco extends Producto{

    private String fechaenvasado;
    private String paisorigen;
    public ProductoFresco (String fechacaducidad, String numerolote, String fechaenvasado, String paisorigen){
        super(fechacaducidad, numerolote);
        this.fechaenvasado = fechaenvasado;
        this.paisorigen = paisorigen;
    }

    public String getFechaenvasado() {

        return fechaenvasado;
    }

    public void setFechaenvasado(String fechaenvasado) {

        this.fechaenvasado = fechaenvasado;
    }

    public String getPaisorigen() {

        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {

        this.paisorigen = paisorigen;
    }

    @Override
    public String toString() {
        return "La fecha de caducidad es: "+getFechacaducidad()+", el número de lote es: "+getNumerolote()+", se envasó en la fecha: "+getFechacaducidad()+" y proviene del país: "+getPaisorigen();
    }
}
