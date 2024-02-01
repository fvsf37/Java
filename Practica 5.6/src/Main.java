public class Main {
    public static void main(String[] args) {
        public class TestBebida{
            public static void main(String[] args) {
                BebidaCerveza birra = new BebidaCerveza(MarcaCerveza.AMBAR,Vaso.JARRA);
                birra.servir();
                BebidaRefresco refresco = new BebidaRefresco(MarcaRefresco.COCACOLA,Vaso.TUBO);
                refresco.servir();
                BebidaAlcoholica chupito = new BebidaAlcoholica(Vaso.CHUPITO, MarcaAlcoholica.CARDHU);
                chupito.servir();
                birra = new BebidaCerveza(MarcaCerveza.AMBAR, Vaso.TUBO);
                birra.servir();
                BebidaCompuesta pelotazo = new BebidaCompuesta(new BebidaAlcoholica(Vaso.CHUPITO, MarcaAlcoholica.BALLANTINES), new BebidaRefresco(MarcaRefresco.SEVENUP,
                                        Vaso.TUBO));
                pelotazo.servir();
                birra = new BebidaCerveza(MarcaCerveza.GUINNESS, Vaso.CAÑA);
                birra.servir();
                System.out.println("Total de litros de "+MarcaCerveza.AMBAR+" : "+ MarcaCerveza.AMBAR.getCantidad());
                System.out.println("Total de litros de "+pelotazo.getAlcohol().getMarca()+" con "+pelotazo.getRefresco().getMarca()+ " : " + pelotazo.total());
                System.out.println("Total de litros de "+ MarcaRefresco.SEVENUP.getMarca()+" : " + MarcaRefresco.SEVENUP.getCantidad());
                System.out.println("Total de litros de "+MarcaAlcoholica.BALLANTINES.getMarca()+" : " +MarcaAlcoholica.BALLANTINES.getCantidad());
                System.out.println("Total de litros de "+MarcaCerveza.GUINNESS.getMarca()+" : " +MarcaCerveza.GUINNESS.getCantidad());
            }
        }
    }
}