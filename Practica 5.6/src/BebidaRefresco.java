public class BebidaRefresco extends Bebida{
    private MarcaRefresco marca;
    private Vaso tipoVaso;

    public BebidaRefresco(MarcaRefresco marca, Vaso tipoVaso) {
        this.marca = marca;
        this.tipoVaso = tipoVaso;
    }

    @Override
    public void servir() {
        super.servir();
        System.out.println("Refresco "+marca+ " en vaso "+tipoVaso+" con capacidad de "+tipoVaso.getCantidad());
    }
}
