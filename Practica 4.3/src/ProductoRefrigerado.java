public class ProductoRefrigerado extends Producto {
    private String cod;

    public ProductoRefrigerado(String fechacaducidad, String numerolote, String cod) {
        super(fechacaducidad, numerolote);
        this.cod = cod;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "La fecha de caducidad es: "+getFechacaducidad()+", el número de lote es: "+getNumerolote()+" y el código del organismo de supervisión es: "+getCod();
    }
}

