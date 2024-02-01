public class BebidaAlcoholica extends Bebida{
    private MarcaAlcoholica marca;
    private Vaso tipoVaso;

    public BebidaAlcoholica(Vaso tipoVaso,MarcaAlcoholica marca) {
        this.marca = marca;
        this.tipoVaso = tipoVaso;
    }

    @Override
    public void servir() {
        super.servir();
        System.out.println("Bebida alcohólica "+marca+ " en vaso "+tipoVaso+" con capacidad de "+tipoVaso.getCantidad());
    }
}
