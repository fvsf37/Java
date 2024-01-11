public class MyOwnAutoShop {
    public static void main(String[] args) {
    Truck Raptor = new Truck(120,20000,"Negro", 1900);
        System.out.println("El precio de la Ford Raptor es de: "+Raptor.getSalePrice());
    Ford Mondeo = new Ford(150,31000,"Azul",2015,1500);
        System.out.println("El precio del Ford Mondeo es de: "+Mondeo.getSalePrice());
    Ford Puma = new Ford(100,18000,"Amarillo",2023,150);
        System.out.println("El precio del Ford Puma es de: "+Puma.getSalePrice());
    Sedan Insignia = new Sedan(130,28000,"Rojo",1990);
        System.out.println("El precio de la Sedan Insignia es de: "+Insignia.getSalePrice());
    }
}