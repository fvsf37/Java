public class TestHerencia {
    public static void main(String[] args) {
        ProductoFresco pf = new ProductoFresco("20/03/24","25427868","01/11/23","Rumanía");
        ProductoCongelado pc = new ProductoCongelado("20/12/27","2676372",-10.5);
        ProductoRefrigerado pr = new ProductoRefrigerado("10/01/24","7437777","YUYU444");
        System.out.println(pf);
        System.out.println(pc);
        System.out.println(pr);
    }
}
