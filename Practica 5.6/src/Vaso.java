public enum Vaso {
    CAÑA(200), TUBO(250), TERCIO(333),JARRA(500), CHUPITO(5), DOBLE(10), TRIPLE(15);

    private int cantidad;

    Vaso(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
}
