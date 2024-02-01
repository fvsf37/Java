public class BebidaCompuesta extends Bebida{
    private BebidaAlcoholica alcohol;
    private BebidaRefresco refresco;

    public BebidaCompuesta(BebidaAlcoholica alcohol, BebidaRefresco refresco) {
        this.alcohol = alcohol;
        this.refresco = refresco;
    }

    public BebidaAlcoholica getAlcohol() {
        return alcohol;
    }

    public BebidaRefresco getRefresco() {
        return refresco;
    }
    public double total(){
        return refresco.getCantidad() + alcohol.getCantidad();
    }

    @Override
    public void servir() {
        super.servir();

    }
}
