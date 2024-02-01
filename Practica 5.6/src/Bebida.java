public class Bebida {
    private Marca marca;
    private Vaso vaso;
    public Bebida(){
        this.cantidad=0;
    }

    public Bebida(Marca marca, Vaso vaso) {
        this.marca = marca;
        this.vaso = vaso;
    }

    public Marca getMarca() {
        return marca;
    }

    public Vaso getVaso() {
        return vaso;
    }
}
