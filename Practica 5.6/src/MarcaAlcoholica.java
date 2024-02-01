public enum MarcaAlcoholica {
    CARDHU("CARDHU",0), BALLANTINES("BALLANTINES",0);
    String nombre;
    int cantidad;

    MarcaAlcoholica(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
