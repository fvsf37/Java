public class TestHerencia {
    public static void main(String[] args) {
        ProductoRefrigerado Pizza = new ProductoRefrigerado("01/01/2024", "1234", "001");
        ProductoCongelado ArrozChino = new ProductoCongelado("02/02/2024", "4321", "-56");
        ProductoFresco PezEspada = new ProductoFresco("03/03/2024", "258", "01/02/2023", "España");
        System.out.println("Producto Pizza: "+Pizza);
        System.out.println("Producto ArrozChino: "+ArrozChino);
        System.out.println("Producto PezEspada: "+PezEspada);
    }
}