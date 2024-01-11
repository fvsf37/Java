public class Main {
    public static void main(String[] args) {

        SerVivo x = new SerVivo((byte) 3);
        SerVivo y = new SerVivo((byte) 5);
        System.out.println("El ser vivo mayor es "+x.mayor(y));

        x = new Humano((byte) 34, "Homero");
        y = new Humano((byte) 9, "Bart");
        System.out.println("El humano mayor es ");
        System.out.println(((Humano)x).mayor((Humano)y));

        if (((Humano)((Humano)x).mayor((Humano)y)).equals((Humano) x)) {
            System.out.println("El humano menor es \n" + (Humano) y);
        } else {
            System.out.println("El humano menor es \n" + (Humano) x);
        }
    }
}