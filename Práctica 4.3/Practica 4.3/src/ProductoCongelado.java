public class ProductoCongelado extends Producto{
    private String temperatura;

    public ProductoCongelado(String fechacaducidad, String numerolote, String temperatura) {
        super(fechacaducidad,numerolote);
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {

        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "La fecha de caducidad es: "+getFechacaducidad()+", el número de lote es: "+getNumerolote()+" y su temperatura recomendada es: "+getTemperatura()+" grados celsius";
    }
}
